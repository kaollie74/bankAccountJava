

class Person {
  String name;
  String email;
  String phone;
  
  void walk() {
    System.out.println(name + " is walking");
  }
  void eat() {
    System.out.println(email);
  }
  void sleep() {
    System.out.println( name + " is sleeping");
  }
}

public class demo {
  public static void main(String[] args) {

    // Instantiating an object
    Person person1 = new Person();
    // define some properties
    person1.name = "Joe";
    person1.email = "joe@gmail.com";
    person1.phone = "123123213";

    // this is abstraction
    person1.walk();
    person1.sleep();
    person1.eat();

    Person person2 = new Person();
    person2.name = "Sarah";
    person2.sleep();

    // person
    // attributes, variables ,adjectives, descriptors
    // String name = "Joe";
    // String email = "joe@gmail.com";
    // String phone = "2188792480";

    // // Action, activity, behaviour
    // System.out.println( name + " is walking");
    // System.out.println( name + " is eating");

    // // What if we want to do this for another person
    // String name2 = "Sarah";
    // String email2 = "sarah@gmail.com";
    // String phone2 = "2188792480";

    // //System.out.println( name2 + " is walking");
    // System.out.println( name2 + " is eating");
    // walking(name2);
  
    // what about bingin attributes and properties together?

    
  }
    // Enhance by adding function to minize code
  static void walking(String name) {
    System.out.println(name + " is walking");
  }


}

