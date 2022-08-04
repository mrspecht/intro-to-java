// The switch statement

/*
 *  The 'break' statement terminates the 'switch' statement and return flow
 *  control to the enclosing statement
 */

public class Switch_02 {
  public static void main(String[] args) {
    int num = 1;

    switch(num) {
      case 1:
        System.out.println("One");
      case 2:
        System.out.println("Two");
      default:
        System.out.println("Three");
    }
  }
}
