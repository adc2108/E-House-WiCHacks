package Classes;

public class Child {
    private Bank bank;
    private double cashIN;

    public Child(Bank bank) {
        cashIN = 0;
        this.bank = bank;
    }


    public String viewAccountBalance() {
        return "Account Balance: " + bank.getBankBalance();
    }

    public String CashIn(double amount) {
        if(amount <= bank.getBankBalance()) {
            bank.decreaseBankBalance(amount);
            return "Amount Accepted !";
        }
        else {
            return "Your Account Balance does not have enough funds";
        }
    }

    public String invest(double amount) {
        if(amount <= bank.getBankBalance()) {
            Stock stock = new Stock();
            stock.increaseStockBalance(amount);
            return "Invested " + amount + " in stocks!";
        }
        else{
            return "Cannot invest " + amount + "because account balance is too low";
        }
    }

    public String endInvest() {
        double amount = bank.getBankBalance();
        bank.increaseBankBalance(Stock.getStockBalance());
        bank.decreaseBankBalance(0);
        return "Your investment has ended and " + amount + " has been added back to your account";
    }

 //   public String invest(double investment) {
   //     if(investment > getBankBalance()) {
     //       return "Cannot Invest " + investment + " amount";
       // }
      //  else {
        //    increaseBankBalance(investment);
         //   return "Invested " + investment + " into Stocks";
       // }
   // }

}
