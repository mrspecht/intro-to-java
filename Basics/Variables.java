// Declaring multiple variables

/*
  You can declare and initialize multiple variables in the same statement

  int a: variable declaration
  a = 5: assignment statement
*/

public class Variables {
  public static void main(String[] args) {
    int a, b, c;
    // The above is required
    int d = c = b = a = 5;

    int e, f, g, i = 7;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    // System.out.println(e);  Error: variable e might not have been initialized

    String s1 = "Hello", s2 = "world";
    System.out.println(s1 + " " + s2);
  }
}
