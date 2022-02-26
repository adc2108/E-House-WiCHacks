package Classes;

public class Bank extends Stock{
    private double accountBalance;
    private final static int WEEKLY = 100;

    public Bank() {
        Stock stock = new Stock();
        accountBalance = 0;
    }

    /**
     * Updates account balance by 50.
     * Every week call update account balance
     */
    public void updateAccount(){
        this.accountBalance += WEEKLY;
    }

    /**
     * get account balance
     * @return account balance
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void increaseAccountBalance(double amount) {
        this.accountBalance += amount;
    }

    public void decreaseAccountBalance(double amount) {
        this.accountBalance -= amount;
    }

    /**
     * invest money in stock
     * Can't exceed account balance
     */
    public String invest(double investment) {
        if(investment > this.accountBalance) {
            return "Cannot Invest " + investment + " amount";
        }
        else {
            updateBalance(investment);
            return "Invested " + investment + " into Stocks";
        }
    }

}
