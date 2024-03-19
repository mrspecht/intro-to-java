// The while statement

/*
  A repetition control structure, which we refer to as a loop, executes a
  statement of code multiple times in succession

  The while loop has two important parts: a boolean expression that is tested
  for a true or false value, and a statement or block of statements that is
  repeated as long as the expression is true
*/

public class While_01 {
  public static void main(String[] args) {
    int x = 5;

    while (x > 0) {
      System.out.println(x);
      x--;
    }
  }
}
