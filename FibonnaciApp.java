public class FibonnaciApp {

  public static void main(String[] args) {

    // Fibonnnaci number is defined by the sum of the previous fibonnaci numbers
    // fib(0) = 0;
    // fib(1) = 1;
    // fib(2) = fib(1) + fibz(0) = 0 + 1 = 1;
    // fib(3) = fib(2) + fib(1) = 1 + 1 = 2;
    // fib(4) = fib(3) + fib(2) = 2 + 1 = 3
    // fibZ(5) = fib(4) + fib(3) = 3 + 2; 
    System.out.println(fib(5));

    /* factorial is: 
      1! = 1 * 1 
      2! = 2 * 1
      3! = 3 * 2 * 1
      4! = 4 * 3 * 2 * 1
    */
    int [] array = {10, 2, 3, 4, 5 };
    System.out.println( "the max value is: " + max(array));
    System.out.println( "the min value is: " + min(array));
    System.out.println( "the average value is: " + average(array));
  

    System.out.println(fac(3));
  }

  public static int average(int[] n) {
    int averageTotal = 1;

    for( int i = 0 ; i < n.length ; i++) {
      averageTotal *= n[i];
    }
    return averageTotal / n.length; 
  }

  public static int min(int[] n) {
    int small = n[0];

    for(int i = 0; i < n.length ; i ++) {
      if(n[i] < small) {
        small = n[i];
      }
    }
    return small; 
  } 

  public static int max(int[] n) {
    int big = n[0];
    for ( int i = 0; i < n.length ; i ++) {
      if( n[i] > big) {
        big = n[i];
      }
    }
    return big;
  }

  public static int fac( int n) {
    int total = n; 
    for( int i = n ; i > 1; i-- ) {
      System.out.println(total *= (n -1)); 
    }
    return total; 
  }

  public static int fib(int n) {

    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    // this is called recursion
    // call the fib function on itself
    return ( fib(n - 1) + fib(n - 2));
  } // END int fib

}