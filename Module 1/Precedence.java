// Operator precedence

/*
  An operator is a special symbol that can be applied to a set of variables,
  values, or literals—referred to as operands—and that returns a result
  Java operators are not necessarily evaluated from left-to-right order

  Unless overridden with parentheses, Java operators follow this order
  ++. --  (pre/post-unary operator)
  *, /, % (multiplication, division, modulus)
  +, -    (addition, subtraction)
*/

public class Precedence {
  public static void main(String[] args) {
    int x = 9;
    int y = 8 + 7 - --x;    // x == 8
    int z = 3 y - x / 2;  // y == 7

    System.out.println(z);  // z == 17
  }
}
