package Classes;

import java.util.Arrays;

public class Parent extends Bank{

    private String[] prize;
    private double value;

    public Parent(){
        this.value = 0;
        this.prize = null;
    }

    public void setPrize(String[] prize, double value){
        this.prize = prize;
        this.value = value;
    }

    public String viewPrize() {
        return "Prizes are: " + Arrays.toString(this.prize) + " and they are worth: " + this.value;
    }

    public String acceptCashIN(double amount) {
        if(amount <= getAccountBalance()) {
            this.decreaseAccountBalance(amount);
            return "Amount Accepted !";
        }
        else {
            return "Your Account Balance does not have enough funds";
        }
    }
}
