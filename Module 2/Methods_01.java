// Creating methods

/*
 *  A method is a block of code which only runs when it is called. Methods are
 *  used to perform certain actions, and they are also known as functions
 */

public class Methods_01 {
  public void welcome() {
    System.out.println("Welcome to Java methods");
  }

  public String name(String name) {
    return name;
  }

  public static void main(String[] args) {
    Methods m = new Methods();
    m.welcome();
    System.out.println("John Doe");
  }
}
