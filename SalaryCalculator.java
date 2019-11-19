public class SalaryCalculator {
  public static void main(String[] args) {
    // Create a variable to define our career

    // Declare a variable
    String career;
    System.out.println("Program is starting");

    //Defined a variable
    career = "Software Developer";
    System.out.println("My career is: " + career);

    // Declare & define
    int hoursPerWeek = 40;
    int weeksPerYear = 52;
    double rate = 42.50; 
    double salary = hoursPerWeek * weeksPerYear * rate; 

    System.out.println("My salary as a " + career + " , I make $" + salary + " per year" );

    // Compute our annual salary
    // rate * hoursPerWeek * weeksPerYear
  }
}