public class Main {
    public static void main(String[] args) {
        printComparison(53, -87);
        printComparison(81.653, -81.653);
        printComparison(90, 10);
    }

    private static void printComparison(double x, double y) {
        ComparatorAbs comp = new ComparatorAbs();
        if (comp.compare(x, y) > 0) {
            System.out.println("|" + x + "| > |" + y + "|");
        }
        else if (comp.compare(x, y) < 0) {
            System.out.println("|" + x + "| < |" + y + "|");
        }
        else {
            System.out.println("|" + x + "| = |" + y + "|");
        }
    }
}