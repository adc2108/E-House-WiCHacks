package Classes;

public class Bank {
    private double accountBalance;

    private final static int WEEKLY = 50;

    public Bank() {
        this.accountBalance = 0;

    }

    /**
     * Updates account balance by 100.
     * Every week call update account balance
     */
    public void updateAccount(){
        this.accountBalance += WEEKLY;
    }

    /**
     * get account balance
     * @return account balance
     */
    public double getBankBalance() {
        return accountBalance;
    }

    public void increaseBankBalance(double amount) {
        accountBalance += amount;
    }

    public void decreaseBankBalance(double amount) {
        accountBalance -= amount;
    }

}
