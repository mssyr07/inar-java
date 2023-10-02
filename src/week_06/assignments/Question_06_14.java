package week_06.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        double start = 1;
        double end   = 901;
        System.out.println("\ni           m(i)     ");
        System.out.println("---------------------");
        for (double i = start; i <= end; i += 100) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", estimatePI(i));
        }
    }

    /** Method estimatePI */
    public static double estimatePI(double n) {
        double pi = 0;
        for (double i = 1; i <= n; i ++) {
            pi += Math.pow(-1, i +1) / (2 * i - 1);
        }
        pi *= 4;
        return pi;
    }
}
