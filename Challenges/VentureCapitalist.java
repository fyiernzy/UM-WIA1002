import java.util.*;

public class VentureCapitalist {
    String name;
    double revenue;
    String SDG;
    String CSR;
    double investorSentiment;
    double marketTraction;
    double revenueRank;
    static int count = 0;

    VentureCapitalist(String name, int revenue, String SDG, String CSR, double investorSentiment,
            double marketTraction) {
        this.name = name;
        this.revenue = revenue;
        this.SDG = SDG;
        this.CSR = CSR;
        this.investorSentiment = investorSentiment;
        this.marketTraction = marketTraction;
        count++;
    }

    static int getSDGRank(String SDG) {
        switch (SDG) {
            case "CleanEnergy":
                return 5;
            case "QualityEducation":
                return 4;
            case "ZeroHunger":
                return 3;
            case "AffordableHousing":
                return 2;
            case "GenderQuality":
                return 1;
            default:
                return 0;
        }
    }

    static int getCSRRank(String CSR) {
        switch (CSR) {
            case "Excellent":
                return 3;
            case "Good":
                return 2;
            case "Fair":
                return 1;
            default:
                return 0;
        }
    }

    static void proposeRevenueRank(ArrayList<VentureCapitalist> vc) {
        double min = Integer.MAX_VALUE, max = Integer.MAX_VALUE;
        for (VentureCapitalist v : vc) {
            if (v.revenue < min) {
                min = v.revenue;
            }
            if (v.revenue > max) {
                max = v.revenue;
            }
        }

        Collections.sort(vc, (a, b) -> Double.compare(a.revenue, b.revenue));
        for (int i = 0; i < vc.size(); i++) {
            vc.get(i).revenueRank = vc.get(i).revenue / (max - min);
        }
    }

    public double getEvalaution() {
        double revenuePortion = this.revenueRank * 0.4;
        System.out.println(revenuePortion + ", revenueRank: " + this.revenueRank);
        double SDGportion = getSDGRank(this.SDG) / (double) 5 * 0.2;
        System.out.println(SDGportion);
        double CSRportion = (getCSRRank(this.CSR) / (double) 3) * 0.1;
        System.out.println(CSRportion);
        double investorSentimentportion = investorSentiment / (double) 10 * 0.2;
        System.out.println(investorSentimentportion + ", " + investorSentiment);
        double marketTractionportion = marketTraction / 10 * 0.1;
        System.out.println(marketTractionportion);
        return revenuePortion + SDGportion + CSRportion + investorSentimentportion + marketTractionportion;
    }

    public static void main(String[] args) {
        ArrayList<VentureCapitalist> vc = new ArrayList<>();
        vc.add(new VentureCapitalist("Startup 1", 1507366, "AffordableHousing",
                "Fair", 7.9, 6.9));
        System.out.println(vc.get(0).getEvalaution());
        // vc.add(new VentureCapitalist("Startup 2", 4528147, "ZeroHunger",
        // "Fair", 7.2, 6.4));
        // vc.add(new VentureCapitalist("Startup 3", 179369, "GenderEquality",
        // "Fair", 8.9, 9.6));
        // vc.add(new VentureCapitalist("Startup 4", 5721980, "QualityEducation",
        // "Excellent", 8.5, 9.1));
        // vc.add(new VentureCapitalist("Startup 5", 7599769, "ZeroHunger",
        // "Excellent", 9.0, 8.0));

        // Collections.sort(vc, (a, b) -> -1 * Double.compare(a.getEvalaution(),
        // b.getEvalaution()));
        // vc.forEach((a) -> System.out.println(a.name + " " + a.getEvalaution()));
    }
}
