package week_09.assignments;

public class Stock_09_02 {

    String symbol;

    String name;

    double previousClosingPrice;

    double currentPrice;


    public Stock_09_02(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;

    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }


}
