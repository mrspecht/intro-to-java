// The switch statement

/*
  The 'switch' statement is a complex decision-making structure in which a
  single value is evaluated and flow is redirected to the first matching
  branch, known as a case statement
*/


public class Switch_01 {
  public static void main(String[] args) {
    int num = 1;

    switch(num) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      default:
        System.out.println("Another number");
    }
  }
}
