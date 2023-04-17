package Friday;

import java.util.*;
import Friday.Data.*;
import Friday.Feature.*;
import Friday.Utils.*;

public class Main {
    public static void main(String[] args) {
        // * Initialize the features
        Transaction transaction = new Transaction(Dataset.getSortedTransactionTable());
        Login login = new Login(Dataset.getSortedLoginTable());
        Fraudulent<Boolean> fraudulent = new Fraudulent<>(Dataset.getSortedFraudTable());
        Fraudulent<Double> scaleFraudulent = new Fraudulent<>(Dataset.getSortedFraudScaleTable());
        Fraudulent<Boolean> fraudulentCopy = new Fraudulent<>(Dataset.getSortedFraudTable());
        Fraudulent<Double> scaleFraudulentCopy = new Fraudulent<>(Dataset.getSortedFraudScaleTable());

        // * Perform data cleaning and transformation
        transaction.dataCleaning().transformation();
        login.dataCleaning();

        fraudulent.dataCleaning().transformation(isFraud -> isFraud)
                .merge(
                        scaleFraudulent.dataCleaning().transformation(fraudScale -> fraudScale < 0.5 ? 0.0 : 1.0),
                        fraudScale -> fraudScale >= 0.5);
        scaleFraudulentCopy.dataCleaning()
                .merge(fraudulentCopy.dataCleaning(), isFraud -> isFraud ? 1.0 : 0.0)
                .transformation(fraudScale -> fraudScale < 0.5 ? 0.0 : 1.0);

        // * Print the features
        TableUtil.printTable(transaction, "Transaction Table", new String[] { "User", "Transaction", "Date" });
        TableUtil.printTable(login, "Login Table", new String[] { "User", "Coordinate", "Date" });
        TableUtil.printTable(fraudulent, "Fraud Table", new String[] { "User", "is_fraud", "Date" });
        TableUtil.printTable(scaleFraudulentCopy, "Fraud Scale Table", new String[] { "User", "fraud_scale", "Date" });

        List<List<?>> list = pointInTimeJoin(List.of(transaction, login), fraudulent);
        System.out.printf("%10s %10s %10s %10s\n", "deviation", "latitude",
                "longitude", "is_fraud");
        for (List<?> row : list)
            System.out.printf("%10.2f %10s %10b\n", (double) row.get(0), row.get(1),
                    row.get(2));
    }

    /**
     * Performs point in time join for all the features input based on the input
     * label
     * and returns a list of list of values of all the features and the label. For
     * every label value, point in time join will search for features' value of the
     * latest date that is before the label date.
     *
     * @param features list of feature objects to perform point in time join on
     * @param label    label feature object to use as reference for point in time
     *                 join
     * @return list of list of values of all the features and the label
     */
    public static List<List<?>> pointInTimeJoin(List<Feature<?>> features,
            Feature<? extends Comparable<?>> label) {

        for (Feature<?> feature : features)
            feature.sortByDate();

        List<List<?>> res = new ArrayList<>();
        for (Data<?> labelData : label.dataList()) {
            List<Object> row = new ArrayList<>();
            String user = labelData.getUser();
            int date = labelData.getDate();

            for (Feature<?> feature : features) {
                List<? extends Data<?>> featureData = feature.dataList();
                if (featureData.isEmpty()) {
                    res.add(null);
                    continue;
                }
                Data<?> latest = featureData.get(0);
                for (Data<?> value : featureData)
                    if (value.getUser().equals(user) && value.getDate() <= date)
                        latest = value;
                row.add(latest.getData());
            }
            row.add(labelData.getData());
            res.add(row);
            // System.out.println(row);
        }
        return res;
    }

}
