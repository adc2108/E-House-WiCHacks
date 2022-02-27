package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Stock {
    private final static int RANDOM_SEED = 2;
    private static final Random rng = new Random(RANDOM_SEED);
    ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(10, 20, 60, 20, 50, 30));

    private double stockBalance;
    private Bank bank;
    private double rand;


    public Stock(Bank bank) {
        stockBalance = 0;
        this.bank = bank;
        this.rand = rand;
    }
    public double RandomNum() {
        double rand = Math.floor(Math.random()*(2-1+1)+1);
        return rand;
    }

    public double getStockBalance() {
        return this.stockBalance;
    }

    public void increaseStockBalance(double invest){
        stockBalance += invest;
    }

    public void decreaseStockBalance(double amount) {
        stockBalance -= amount;
    }

    public void voidStock(){
        stockBalance = 0;
    }

    public void stockChange() {
        Random r = new Random();
        int pull = this.list.get(r.nextInt(list.size()));
        if(rand >= 2) {
            System.out.println("Congrats! " + pull + " Has been added to your stock");
            increaseStockBalance(pull);
            System.out.println("Your new balance is " + getStockBalance());
        }
        else {
            System.out.println("Your stock has dropped and " + pull + " Has been removed from your stock: ");
            if(getStockBalance() <= pull) {
                double remove = pull - getStockBalance();
                bank.decreaseBankBalance(remove);
                voidStock();
                System.out.println(remove + " has been removed from your Bank Account : (");
            }
            else {
                decreaseStockBalance(pull);
                System.out.println("Your new balance is " + getStockBalance());
            }
        }

    }

}
