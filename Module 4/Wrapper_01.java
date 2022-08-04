// The wrapper classes and its methods

/*
 *  The Java API provides wrapper classes for each of the numeric data types.
 *  These classes have methods that perform useful operations involving
 *  primitive numeric values
 */

public class Wrapper_01 {
  public static void main(String[] args) {
    String s = "23";
    int i = 45;

    int integer = Integer.parseInt(s);
    String string = Integer.toString(i);

    System.out.println(integer);
    System.out.println(string);
  }
}
