package Friday.Utils;

import java.util.*;
import Friday.Feature.*;
import Friday.Data.*;

public class TableUtil {
    public static final int CELL_LENGTH = 20;
    public static final String SYMBOL = "-";

    public static <E extends Comparable<E>> void printTable(Feature<E> feature, String title, String[] labels) {
        final int NUM_OF_LABEL = labels.length;

        System.out.println(title);
        printDottedLine(NUM_OF_LABEL);

        System.out.print("|");
        for (String label : labels)
            System.out.print(middleString(label) + '|');
        System.out.println();

        printDottedLine(NUM_OF_LABEL);

        List<Data<E>> dataList = feature.dataList();
        for (Data<E> data : dataList)
            System.out.printf("|%s|%s|%s|\n",
                    middleString(data.getUser()),
                    middleString(value(data.getData())),
                    middleString(value(data.getDate())));

        printDottedLine(NUM_OF_LABEL);
        System.out.println();
    }

    private static String middleString(String str) {
        int space = CELL_LENGTH - str.length();
        int left = space >> 1;
        int right = space - left;
        return String.format("%s%s%s", " ".repeat(left), str, " ".repeat(right));
    }

    private static String value(Object obj) {
        if (obj == null)
            return "null";
        else if (obj instanceof Double)
            return String.format("%.2f", (Double) obj);
        else
            return obj.toString();
    }

    private static void printDottedLine(int numOfLabel) {
        System.out.print("|");
        for (int i = 0; i < numOfLabel; i++)
            System.out.print(SYMBOL.repeat(CELL_LENGTH) + "|");
        System.out.println();
    }
}
