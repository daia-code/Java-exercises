package ro.ITSchool;

public class Stock {
    private String simbol;
    private String stock;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol, String stock, double closingPrice, double currentPrice) {
        this.simbol = simbol;
        this.stock = stock;
        this.closingPrice = closingPrice;
        this.currentPrice = currentPrice;

    }

    public double getChangePercent() {
        return 1.0 - (closingPrice / currentPrice);
    }
}
