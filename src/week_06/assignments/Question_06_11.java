package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("\n SalesAmount     Commission");
        System.out.println("-----------------------------");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf(" %-16.0f", salesAmount);
            System.out.printf("%8.1f\n", computeCommission(salesAmount));
        }
    }

    /** Method commputeCommission computes the commission */
    public static double computeCommission(double salesAmount) {
        double balance,
                commission;
        balance = commission = 0.0;


        if (salesAmount >= 10000.01)
            commission += (balance = salesAmount - 10000) * 0.12;


        if (salesAmount >= 5000.01)
            commission += (balance -= balance - 5000) * 0.10;


        if (salesAmount >= 0.01)
            commission += balance * 0.08;

        return commission;

    }
}
