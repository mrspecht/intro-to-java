// The if-else statement

/*
 *  The 'if-else' statement will execute one group of statements if its boolean
 *  expression is true, or another group if its boolean expression is false
 *  The 'else' block is optional
 */

public class If_01 {
  public static void main(String[] args) {
    int hour = 10;
    int count = 1;

    if (hour > 12)
      System.out.println("Good morning");
      System.out.println(++count);
  }
}
