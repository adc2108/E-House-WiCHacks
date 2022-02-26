package Classes;

public class Parent extends Bank{

    private String[] prize;
    private double value;

    public Parent(){
        this.value = 0;
        this.prize = null;
    }

    private void setPrize(String[] prize, double value){
        this.prize = prize;
        this.value = value;
    }

    private String acceptCashIN(double amount) {
        if(amount <= getAccountBalance()) {
            this.decreaseAccountBalance(amount);
            return "Amount Accepted !";
        }
        else {
            return "Your Account Balance does not have enough funds";
        }
    }
}
