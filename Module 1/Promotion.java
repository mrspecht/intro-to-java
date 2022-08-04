// Numeric promotion

/*
  If one of an operator’s operands is a int, and the other operand is an
  double, Java will automatically convert the value of the int to a double
*/

public class Promotion {
  public static void main(String[] args) {
    int a = 5;
    int b = 5;
    double c = 5.0;
    int d = 0;

    d = a + b;
    System.out.println(d);

    // Error: incompatible types (possible lossy conversion from double to int)
    // d = a + c;

    // Numeric promotion
    System.out.println(a == c);
  }
}
