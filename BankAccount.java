import org.graalvm.compiler.nodes.debug.BlackholeNode;

public class BankAccount {

  // define variables up top
  String accountNumber;

  // static >> belongs to the CLASS, not the object instance
  private static final String routingNumber = "12345";

  // instance variables
  private String name;
  private int ssn;
  String accountType;
  double balance = 0;

  // Constructor definitions >>> These are unique methods
  // 1. use to define / setup / intialize properties of an object.
  // 2. Constructors are Implicitly are called on instantiation.
  // 3. The same name as the class itself
  // 4. Contructors have no return type at all.
  BankAccount() {
    System.out.println("New account created");
  }

  // Overloading we call the same mehtod name with different arguments
  BankAccount(String accountType) {

    System.out.println("NEW ACCOUNT: " + accountType);
  }

  BankAccount(String accountType, double initDeposit) {

    String msg;
    System.out.println("Savings ACCOUNT: " + accountType);
    System.out.println("Initial deposit of: " + initDeposit);

    if (initDeposit < 1000) {
      msg = "Error: Minimum deposit must be at least $1,000.00";
      System.out.println(msg);
    } else {
      msg = "Thanks for your deposit";
      System.out.println(msg);
      balance = balance + initDeposit;
    }
  }

  // GETTERS & SETTERS
  // ALLOW the user to define the name
  public void setName(String name) {
    this.name = "Mr. " + name; 
  }

  public String getName() {
    return name;
  }

  public void setSsn(int ssn) {
    this.ssn = ssn; 
  }

  public int getSsn() {
    return ssn;
  }

  // DEFINE METHODS
  void deposit(double amount) {

    balance += amount;
    showActivity("Deposit");

  } // END deposit()

  void withdraw(double amount) {
    balance -= amount; 
    showActivity("WITHDRAW");
  }

  // Private : can only be called from within the class
  private void showActivity (String activity) {

    System.out.println("YOUR RECENT TRANSACTION: " + activity);
    System.out.println("Your new balance is: $" + balance);
  }

  void checkBalance() {
    System.out.println("Check Balance: " + balance);
  }

  void getStatus() {

  }

  @Override
  public String toString() {

    return "[ NAME: " + name + ". ACCOUNT# " + accountNumber + " ROUTING # " + routingNumber + " BALANCE: $" + balance + " ]";
  }
} // END BankAccount