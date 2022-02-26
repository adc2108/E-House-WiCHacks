package Classes;

public class Child extends Parent{
    private double cashIn;

    public Child() {
        cashIn = 0;
    }

    public String viewAccountBalance() {
        return "Account Balance: " + super.getAccountBalance();
    }

    public void CashIN(double amount) {
        this.cashIn = amount;
    }

    public String invest(double amount) {
        if(amount <= getAccountBalance()) {
            updateStockBalance(amount);
            return "Invested " + amount + " in stocks!";
        }
        else{
            return "Cannot invest " + amount + "because account balance is too low";
        }
    }

    public String endInvest() {
        double amount = this.getStockBalance();
        this.increaseAccountBalance(getStockBalance());
        endInvestment();
        return "Your investment has ended and " + amount + " has been added back to your account";
    }

}
