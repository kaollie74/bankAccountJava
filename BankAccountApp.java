public class BankAccountApp {
  public static void main(String[] args) {

    // Creating a new bank account >>> think instantiate an object
    BankAccount account1 = new BankAccount();
    account1.accountNumber = "123456";
    account1.name = "Kyle";
    account1.balance = 100000;

    account1.deposit(1500);
    account1.deposit(1500);
    account1.deposit(2500);
    account1.withdraw(2500);

     System.out.println("To String: " + account1.toString());

    // BankAccount account2 = new BankAccount("Checking Account");

    // BankAccount account3 = new BankAccount("Savings Account", 5000);
    // System.out.println("Routing number: " + account1.routingNumber);
   
    // account3.checkBalance();

    // //Demo for inheritance
    // CDAccount cd1 = new CDAccount();
    // cd1.balance = 3000;
    // cd1.name = "Steve";
    // cd1.interestRate = "5.5";
    // cd1.accountNumber= "6789";
    // cd1.accountType = "CD Account";
    // System.out.println(cd1.toString());
    // System.out.println(cd1.interestRate);
    // cd1.compound();


  

  } // END main
} // END BankAccountApp