// The do-while statement

public class While_03 {
  public static void main(String[] args) {
    boolean keepGoing = true;
    int result = 14, i = 10;

    do {
      i--;                                                                      // Second iteration
      if (i == 8)                                                               // i == 8
        keepGoing = false;                                                      // keepGoing == false
        result -= 2;                                                            // result == 10 ('if' block without curly braces)
    } while (keepGoing);

    System.out.println(result);
  }
}
