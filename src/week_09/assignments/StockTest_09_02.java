package week_09.assignments;

public class StockTest_09_02 {
    public static void main(String[] args) {

        Stock_09_02 stocked1= new Stock_09_02("ORCL" , "Oracle Corporation");

        stocked1.previousClosingPrice = 34.5;
        stocked1.currentPrice = 34.35;

        System.out.println("Stock Name              : " + stocked1.name);
        System.out.println("Stock Symbol            : " + stocked1.symbol);
        System.out.println("Price Change Percentage : " + stocked1.getChangePercent());

    }
}
