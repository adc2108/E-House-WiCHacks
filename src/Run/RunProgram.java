package Run;

import Classes.Bank;
import Classes.Child;
import Classes.Parent;
import Classes.Stock;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunProgram {


    public RunProgram() {
    }

    //Test Functionality before GUI
    public static void main(String[] args) throws Exception{
        Parent parent = new Parent();
        Child child = new Child();
        Bank bank = new Bank();
        Stock stock = new Stock();



        InputStreamReader ir = new InputStreamReader(System. in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Your prizes: ");
        String prizes = br.readLine();
        String[] prizesTwo = prizes.split(" ");
        System.out.println("How much are these prizes worth? ");
        int value = Integer.parseInt(br.readLine());
        parent.setPrize(prizesTwo, value);
        System.out.println((parent.viewPrize()));

        System.out.println(child.getBankBalance());
        System.out.println("CHECK UPDATE ACCOUNT");
        bank.updateAccount();
        child.updateAccount();
        System.out.println("CHECK Bank getBALANCE");
        System.out.println(bank.getBankBalance());
        System.out.println("CHECK CHILD getBALANCE");
        System.out.println(child.getBankBalance());
        System.out.println();




    }
}
