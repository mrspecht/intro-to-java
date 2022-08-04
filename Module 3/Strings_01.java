// The String class

/*
 *  The String class is 'final', immutable and doesn’t need to be instantiated
 *  with the 'new' operator. An immutable class has no setter methods, and the
 *  getters cannot be overridden
 */

public class Strings_01 {
  public static void main(String[] args) {
    String s1 = new String("Hello ");
    String s2 = "world";
    String s3 = new String(s1 + s2);
    System.out.println(s3);

    char[] s4 = {'S', 't', 'r', 'i', 'n', 'g'};
    System.out.println(s4);

    String s5 = new String(s4);
    System.out.println(s5);
  }
}
