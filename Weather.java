
public class Weather {

  public static void main(String[] args) {

    // This progam will give suggestions of what to wear based on the weather (temp and sun condition)


    int temp = 75;
    String sunCondition = "overcast";

    if (temp > 80) {
      System.out.println("Its pleasant. Wear shorts and t-shirt");

    } else if (temp > 60 && sunCondition == "Sunny") {

      System.out.println("Its cool, wear jeans and long-sleeve shirt");
      System.out.println("Wear a hat to keep the sun out of your eyes");

    } else if(temp > 50 || sunCondition == "overcast") {
      System.out.println("this is a cool day, wear warmer clothes");
    } 
    else {
      System.out.println("Cold day, wear a jacket or sweater");

    }
    System.out.println("THE PROGRAM IS ENDING");
  }
}