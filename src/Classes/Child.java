package Classes;

public class Child {
    private Bank bank;
    private Stock stock;
    private double cashIN;

    public Child(Bank bank, Stock stock) {
        cashIN = 0;
        this.bank = bank;
        this.stock = stock;
    }

    public String viewPrizes() {
        return null;
    }

    public String viewAccountBalance() {
        return "Account Balance: " + bank.getBankBalance();
    }

    public String CashIn(double amount) {
        if(amount <= bank.getBankBalance()) {
            bank.decreaseBankBalance(amount);
            return "Amount Accepted !";
        }
        else {
            return "Your Account Balance does not have enough funds";
        }
    }

    public String invest(double amount) {
        if (amount <= bank.getBankBalance()) {
            stock.increaseStockBalance(amount);
            bank.decreaseBankBalance(amount);
            return "Invested " + amount + " in stocks!";
        } else {
            return "Cannot invest " + amount + "because account balance is too low";
        }
    }

    public String endInvest(boolean end) {
        if(end) {
            double amount = bank.getBankBalance();
            bank.increaseBankBalance(stock.getStockBalance());
            stock.voidStock();
            return "Your investment has ended and " + amount + " has been added back to your account";
        }
        else {
            return "Good Choice! ";
        }
    }
}
