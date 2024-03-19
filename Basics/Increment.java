// Increment and decrement operators

/*
  If the post-unary operator is placed after the operand, then the original
  value of the expression is returned, with operator applied after the value
  is returned
*/

public class Increment {
  public static void main(String[] args) {
    int x = 0;

    System.out.println(x++);  // 0
    System.out.println(x++);  // 1
    System.out.println(x);    // 2

    System.out.println(++x);  // 3
    System.out.println(++x);  // 4

    int z = 1;
    int w = 5 + z++;
    z++;

    System.out.println(w);   // 6
    System.out.println(z);   // 3
  }
}
