package Run;

import Classes.Bank;
import Classes.Child;
import Classes.Parent;
import Classes.Stock;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunProgram {
    private final static int WEEKS = 3;

    public RunProgram() {
    }


    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        Stock stock = new Stock(bank);

        System.out.println("""
                    Welcome to our Investment/Stock Simulator!\s
                    Here is a list of functions your pairing can use\s
                    Parent:\s
                    - Set Prizes: Can set a list of prizes for your player\s
                    - View Account Balance: Can view your player's Bank Balance\s
                    - View Prizes: Can view the remaining prizes you have set\s
                    \s
                    Player:\s
                    - View Account Balance: Can view your current Bank Balance\s
                    - Cash In: Can cash in money for a prizes\s
                    - Invest: Can decide to invest a portion of money into a stock\s
                    - End Investment: Can end the investment and the current stock amount will return to your bank\s
                    \s
                    Enjoy the simulation <3""");
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            System.out.println("<Parent> Please pick three prizes for your player: ");
            String prizes = br.readLine();
            String[] prizesTwo = prizes.split(" ");
            System.out.println("<Parent> Please choose a value for player's prizes: ");
            int value = Integer.parseInt(br.readLine());
            Parent parent = new Parent(bank, stock, value);
            parent.setPrize(prizesTwo);
            Child child = new Child(bank, stock);

        for(int i = 1; WEEKS >= i; i++) {
            bank.updateAccount();
            System.out.println("Simulation will run for three weeks, with $50 added to the Player's account" +
                    " each week\n");
            System.out.println("Bank Account Balance: " + bank.getBankBalance() + "\nStock Balance: " + stock.getStockBalance() +
                    "\nList of prizes: " + parent.viewPrize());

            //Invest Portion
            System.out.println("\nDoes the player want to invest in stock? y/n");
            String bool = br.readLine();
            String yes = "y";
            if (bool.equals(yes)) {
                System.out.println("How much do you want to invest? ");
                int amount = Integer.parseInt(br.readLine());
                child.invest(amount);
            }
            System.out.println("Would you like to end your investment: y/n");
            String boolTwo = br.readLine();
            System.out.println(child.endInvest(boolTwo.equals(yes)));

            //Reward Portion
            System.out.println("Does the player want to trade in " + value + " for a prize?");
            String boolThree = br.readLine();
            if (boolThree.equals(yes)) {
                System.out.println("Which Prize? ");
                String pickPrize = br.readLine();
                bank.decreaseBankBalance(value);
                System.out.println("You have received " + pickPrize + " !");
                parent.removePrize(pickPrize);
            }
            System.out.println("See you next week! ");
            System.out.println("Current Bank Balance: " + bank.getBankBalance());

            //Stock Change
            System.out.println("\nStock Market Updates: \n");
            stock.stockChange();
            System.out.println("\n");
        }
    }
}
