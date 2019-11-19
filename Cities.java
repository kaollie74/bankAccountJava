public class Cities {
  public static void main ( String[] args) {

    // declare and define array.
    String[] cities = { "New York", "Minnesota", "Dallas" };

   System.out.println(cities[0]);

    for(int i = 0 ; i < cities.length; i++ ) {
      System.out.println(cities[i]);

    } // end for

    // DO WHILE LOOP. 
    int i = 0;
    do {
      
      System.out.println(" This is cities DO WHILE: " + cities[i]);
      i ++;
    }while( i < cities.length);

    /************************* WHILE LOOP */
    int j = 0; 
    while (j < cities.length){
      System.out.println("Cities WHILE LOOP : " + cities[j]);
      j += 2; 

    }
    // another way to declare array and assign values to it
    // the new String[4] is how many elements will exist in the array.

    String[] states = new String[4];
    states[0] = "California";
    states[1] = "Minnesota";
    states[2] = "Texas";
    states[3] = "New York";
    System.out.println(states);
  }
}