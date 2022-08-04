// The equality operator

/*
  For object comparison, the equality operator is applied to the references
  to the objects, not the objects they point to. Two references are equal if
  and only if they point to the same object, or both point to null
*/

public class Comparison {
  public static void main(String[] args) {
    // Literals (pool of strings)
    String x = "Jack";
    String y = "Jack";
    System.out.println(x == y); // true

    String a = new String("John");
    String b = new String("John");

    System.out.println(a == b);  // false

    // Both references point to the same object
    String c = a;
    System.out.println(a == c);       // true
    System.out.println(a.equals(b));  // true
  }
}
