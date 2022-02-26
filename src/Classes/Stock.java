package Classes;

public class Stock {
    private double stockBalance;

    public Stock() {
        stockBalance = 0;
    }

    public double getStockBalance() {
        return this.stockBalance;
    }

    public void updateStockBalance(double invest){
        stockBalance += invest;
    }

    public void endInvestment() {
        stockBalance = 0;
    }


}
