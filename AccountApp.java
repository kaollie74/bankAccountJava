public class AccountApp {

  public static void main(String[] args) {

    LoanAccount la = new LoanAccount();

    la.increaseRate();
    la.setRate();
    la.setAmmortSchedule();
    la.setTerm(20);

    // Polymorphism changes where we are pointing
    // creating a variable base on the properties in "IRate" but it is points to the 'LoanAccount' class
    IRate accountOne = new LoanAccount();
    accountOne.increaseRate();
    accountOne.setRate();
  }

}