package Classes;

public class Child extends Bank{
    private double cashIn;

    public Child() {
        super();
        cashIn = 0;
    }

    public String viewAccountBalance() {
        return "Account Balance: " + getBankBalance();
    }

    public void CashIN(double amount) {
        this.cashIn = amount;
    }

    public String invest(double amount) {
        if(amount <= getBankBalance()) {
            Stock stock = new Stock();
            stock.increaseStockBalance(amount);
            return "Invested " + amount + " in stocks!";
        }
        else{
            return "Cannot invest " + amount + "because account balance is too low";
        }
    }

    public String endInvest() {
        double amount = getBankBalance();
        this.increaseBankBalance(Stock.getStockBalance());
        decreaseBankBalance(0);
        return "Your investment has ended and " + amount + " has been added back to your account";
    }

}
