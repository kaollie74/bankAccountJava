
public class BankAccountApp2 {

   public static void main(String[] args) {
    BankAccount2 account1 = new BankAccount2("123456789");
    BankAccount2 account2 = new BankAccount2("123456789");
    BankAccount2 account3BankAccount2 = new BankAccount2("123456789");

    account1.setName("Kyle Allen Olson");
    System.out.println("On line 10" + account1.getName());
  }
}

class BankAccount2 {
  
  //Properties of bank account
  private static int ID = 1000;                       // Internal ID 
  private String accountNumber; // ID + random 2-digit number + first 2 of SSN
  private final static String routingNumber = "98754321"; 
  private String name;
  private String SSN;
  private double balance;



  //Constructors
  public BankAccount2(String SSN) {
    //System.out.println("New Account Created");
    this.SSN = SSN;
    System.out.println(SSN);
    ID++;
    setAccountNumber(); 
  }

  private void setAccountNumber() {
    int random = (int) (Math.random() * 100);
    accountNumber = ID + "" + random + SSN.substring(0,2); 
    System.out.println("Your account number: " + accountNumber);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name; 
  }
}