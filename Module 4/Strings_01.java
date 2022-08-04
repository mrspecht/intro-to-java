// The String class and its methods (part 2)

/*
 *  Tokenizing a string is a process of breaking a string down into its
 *  components, which are called tokens. The String class’s split method can be
 *  used to tokenize strings
 */

public class Strings_01 {
  public static void main(String[] args) {
    String beatles = "John, Paul, George, Ringo";
    String[] arr = beatles.split(", ");

    for (String elem : arr) {
      System.out.println(elem);
    }
  }
}
