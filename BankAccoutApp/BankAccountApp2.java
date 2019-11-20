
public class BankAccountApp2 {

  public static void main(String[] args) {
    BankAccount2 account1 = new BankAccount2("123456789", 1000);
    BankAccount2 account2 = new BankAccount2("123456789", 2500);
    BankAccount2 account3 = new BankAccount2("123456789", 2500);

    account1.setName("Kyle Allen Olson");
    System.out.println("On line 10" + account1.getName());
    account1.makeDeposit(100);
    account1.makeDeposit(255);
    account1.payBill(180);
    account1.accrue();
    System.out.println(account1.toString());
  }
}

class BankAccount2 implements IInterest {

  // Properties of bank account
  private static int ID = 1000; // Internal ID
  private String accountNumber; // ID + random 2-digit number + first 2 of SSN
  private final static String routingNumber = "98754321";
  private String name;
  private String SSN;
  private double balance;

  // Constructors
  public BankAccount2(String SSN, double amount) {
    // System.out.println("New Account Created");
    balance = amount;
    this.SSN = SSN;
    System.out.println(SSN);
    ID++;
    setAccountNumber();
  }

  private void setAccountNumber() {

    int random = (int) (Math.random() * 100);
    accountNumber = ID + "" + random + SSN.substring(0, 2);
    System.out.println("Your account number: " + accountNumber);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void payBill(double amount) {
    balance -= amount;
    showBalance();
  }

  public void makeDeposit(double amount) {
    balance += amount;
    showBalance();
  }

  public void showBalance() {
    System.out.println(balance);
  }

  @Override
  public void accrue() {
    balance = balance * (1 + rate / 100); // rate comes from interface
    showBalance();
  }

  @Override
  public String toString() {
    return "[ Name:" + name + "]\n [ Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber
        + "]\n" + "[ Balance: " + balance + "]";
  }
}