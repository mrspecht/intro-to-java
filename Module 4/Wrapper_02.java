// The wrapper classes and its methods

import static java.lang.Integer.*;
import static java.lang.System.*;

public class Wrapper_02 {
  public static void main(String[] args) {
    String s = "23";
    int i = 45;

    int integer = parseInt(s);
    String string = Integer.toString(i);

    out.println(integer);
    out.println(string);
  }
}
