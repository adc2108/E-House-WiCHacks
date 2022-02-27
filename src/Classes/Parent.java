package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Parent {
    private Bank bank;
    private Stock stock;
    private double oldValue;
    private String[] prize;
    private double value;

    public Parent(Bank bank, Stock stock, int value){
        this.bank = bank;
        this.stock = stock;
        this.value = value;
        this.prize = null;
    }

    public String viewAccountBalance() {
        return "Balance: " + bank.getBankBalance();
    }


    public void setPrize(String[] prize){
        this.prize = prize;
    }

    public String viewPrize() {
        String list = Arrays.toString(prize).replace("[", "").replace("]", "");
        return "Prizes are: " + list + "\nEach prize is worth: " + this.value;
    }

    public void removePrize(String remove){
        ArrayList<String> output = new ArrayList<>(Arrays.asList(this.prize));
        output.remove(remove);
        this.prize = output.toArray(new String[0]);
    }
}
