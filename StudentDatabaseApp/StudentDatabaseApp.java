
public class StudentDatabaseApp {

  public static void main(String[] args) {
    // Create a Student
   StudentDatabase student1 = new StudentDatabase("Kyle", "123456");
   //StudentDatabase student2 = new StudentDatabase("John", "123456");
   //System.out.println(setEmailId());
   //System.out.println(student1.name);

   student1.enroll("Math150");
   student1.enroll("English550");
   student1.enroll("History550");

   student1.showCourses();
   //student1.checkBalance();
   student1.payTuition(300);
   //student1.checkBalance();
   System.out.println(student1.toString());
   
  } // END main

} // END StudentDatabaseApp

class StudentDatabase {

  private static int ID = 0;
  private String userId; 
  private String SSN;
  private String emailId;
  private String name;
  private String phone;
  private String city;
  private String state;
  private String courses = "";
  private static final int costOfCourse = 800;
  private int balance = 0;
  
  

  // newStudent CONSTRUCTOR
  public StudentDatabase(String name, String SSN) {
    ID++;
    this.SSN = SSN;
    this.name = name; 
  
    
  }

  private void setEmailId() {

    emailId = name.toLowerCase() + "."+ ID + "@gmail.com";
    System.out.println("Your email is: " + emailId);
  }

  private void setUserId() {
    // wanting the ranNum to be between 9000 and 10000
    int max = 9000;
    int min = 1000;
    int ranNum = (int) (Math.random() * ((max - min)));
    ranNum = ranNum + min;
    //System.out.println(ranNum);
    //System.out.println((max - min) * 10);
    //System.out.println((int) Math.random());
    userId = ID + "" + ranNum + SSN.substring(5);
    System.out.println("Your user ID is: " + userId);
  }

  public void enroll(String course) {
    this.courses = this.courses + " " + course;
    balance = balance + costOfCourse; 

  }

  public void payTuition(int amount) {
    System.out.println("Payment: $" + amount);
    balance -= amount;
    
  }

  public void checkBalance() {

    System.out.println("BALANCE: $" + balance);
  }

  public void showCourses() {
    System.out.println("COURSES: " + courses);
  }
  @Override
  public String toString() {
      return "[ NAME: " + name + " ]\n [ COURSES: " + courses + " ]\n" + "[ BALANCE: $" + balance + " ]\n" ;
  }


  // PHONE SETTER
  public void setPhone(String phone) {
    this.phone = phone;
  }
  // PHONE getter
  public String getPhone() {
    return phone;
  }
  // CITY SETTER
  public void setCity(String city) {
    this.city = city;
  }
  // CITY getter
  public String getCity() {
    return city;
  }
  // STATE SETTER
  public void setState(String state) {
    this.state = name;
  }
  // STATE getter
  public String getState() {

    return state; 
  }
} // END StudentDatabaseApp
