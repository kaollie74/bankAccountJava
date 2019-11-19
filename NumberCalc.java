public class NumberCalc {

  public static void main(String[] args) {

    System.out.println("Program is starting");
    printName();

    int a = 10;
    int b = 25;
    addNumbers(a, b);

    int product = multiplyNumber(a, b);
    System.out.printf( "The product total is %d%n:", product);
  }

  static void printName() {
    System.out.println("My name is kyle");
  }

  static void addNumbers(int a, int b) {
    // this function will add two numbers
    int total = a + b;
    System.out.println("The total is: " + total);
  }

  static int multiplyNumber(int a, int b) {

    int total = a * b;
    addNumbers(total, total);
    return total;
    // System.out.println("the product is: " + total);
  }

}