public class BankAccountApp {
  public static void main(String[] args) {

    // Creating a new bank account >>> think instantiate an object
    BankAccount account1 = new BankAccount();

     
    // OLD WAY of naming a variable >> account1.name = "Kyle";
    // NEW WAY (ENCAPSUALTION) >> public API's
    account1.setName("Kyle Olson");
    System.out.println(account1.getName());
    account1.setSsn(99999999);
    System.out.println(account1.getSsn());

    account1.accountNumber = "123456";
    account1.balance = 100000;

    // interface methods >> idea like having a contract
    account1.setRate();
    account1.increaseRate();

    account1.deposit(1500);
    account1.deposit(1500);
    account1.deposit(2500);
    account1.withdraw(2500);

    // Polymorphism through overriding
     System.out.println("To String: " + account1.toString());

     // Polymorphism through overloading
    BankAccount account2 = new BankAccount("Checking Account");
    account2.accountNumber = "01020304";

    BankAccount account3 = new BankAccount("Savings Account", 5000);
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