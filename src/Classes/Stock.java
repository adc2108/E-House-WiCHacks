package Classes;

public class Stock {
    private static double stockBalance;

    public Stock() {
        stockBalance = 0;
    }

    public static double getStockBalance() {
        return stockBalance;
    }

    public void increaseStockBalance(double invest){
        stockBalance += invest;
    }

    public void decreaseStockBalance(double amount) {
        stockBalance = 0;
    }


}
