package Classes;

import java.util.Arrays;

public class Parent {
    private Bank bank;
    private double oldValue;
    private String[] prize;
    private double value;

    public Parent(Bank bank){
        this.bank = bank;
        this.value = 0;
        this.prize = null;
    }

    public String viewAccountBalance() {
        return "Balance: " + bank.getBankBalance();
    }


    public void setPrize(String[] prize, double value){
        this.prize = prize;
        this.value = value;
    }

    public String viewPrize() {
        return "Prizes are: " + Arrays.toString(this.prize) + " and they are worth: " + this.value;
    }
}
