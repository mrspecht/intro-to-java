// The do-while statement

/*
 * The 'do-while' statement executes instructions at least once
 */

public class While_02 {
  public static void main(String[] args) {
    int x = 5;

    if (x == 5) {
      do {
        System.out.println(x);
        x--;
      } while (x > 0);
    }
  }
}
