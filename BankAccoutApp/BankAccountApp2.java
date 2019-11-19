
public class BankAccountApp2 {

   public static void main(String[] args) {
    BankAccount2 account1 = new BankAccount2("123456789");
    BankAccount2 account2 = new BankAccount2("123456789");
    BankAccount2 account3 = new BankAccount2("123456789");
  }
}

class BankAccount2 {
  
  //Properties of bank account
  private static int ID = 1000;                       // Internal ID 
  private String accountNumber; // ID + random 2-digit number + first 2 of SSN
  private String routingNumber;
  private String name;
  private String SSN;
  private double balance;

  //Constructors
  public BankAccount2(String SSN) {
    System.out.println("New Account Created");
    this.SSN = SSN;
    ID++;
    setAccountNumber();
  
    
  }

  private void setAccountNumber() {
    int random = (int) (Math.random() * 100);
    accountNumber = ID + random + SSN.substring(0,1); 
    System.out.println(accountNumber);
  }
}