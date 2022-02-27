package Run;

import Classes.Bank;
import Classes.Child;
import Classes.Parent;
import Classes.Stock;
import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunProgram {

    public RunProgram() {
    }


    public static void main(String[] args) throws Exception{
        Bank bank = new Bank();
        Stock stock = new Stock(bank);
        Parent parent = new Parent(bank, stock);
        Child child = new Child(bank, stock);
        RunProgram runProgram = new RunProgram();


        InputStreamReader ir = new InputStreamReader(System. in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Your prizes: ");
        String prizes = br.readLine();
        String[] prizesTwo = prizes.split(" ");
        System.out.println("How much are these prizes worth? ");
        int value = Integer.parseInt(br.readLine());
        parent.setPrize(prizesTwo, value);
        System.out.println((parent.viewPrize()));

        System.out.println("INITIAL VOID BANK");
        System.out.println(bank.getBankBalance());
        System.out.println("CHECK UPDATE ACCOUNT");
        bank.updateAccount();
        System.out.println("CHECK Bank getBALANCE");
        System.out.println(child.viewAccountBalance());
        System.out.println("CHECK CHILD getBALANCE");
        System.out.println(bank.getBankBalance());


        System.out.println("TEST CASHIN" + "\n" + "Cashin IN: ");
        double cash = Integer.parseInt(br.readLine());
        System.out.println(child.CashIn(cash));
        System.out.println(bank.getBankBalance());

        System.out.println("TEST INVEST: ");
        double invest = Integer.parseInt(br.readLine());
        child.invest(invest);
        System.out.println("Stock Balance");
        System.out.println(stock.getStockBalance());
        System.out.println("Bank Balance");
        System.out.println(bank.getBankBalance());

        System.out.println("TEST END INVESTMENT");
        System.out.println("Would you like to end your investment: y/n");
        String bool = br.readLine();
        String yes = "y";
        System.out.println(child.endInvest(bool.equals(yes)));
        System.out.println("Bank Balance: ");
        System.out.println(bank.getBankBalance());
        System.out.println("Stock Balance: ");
        System.out.println(stock.getStockBalance());

        System.out.println("RANDOM TEST");
        stock.stockChange();




    }
}
