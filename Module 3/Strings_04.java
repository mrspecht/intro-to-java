// The String class and its methods

public class Strings_04 {
  public static void main(String[] args) {
    String s1 = "Java programming";

    System.out.println(s1.substring(0, 4));                                     // Java
    System.out.println(s1.substring(5));                                        // programming
    System.out.println(s1.substring(6, 6));                                     // Empty string
    // System.out.println(s1.substring(8, 7));                                  // Exception (string index out of range)

    String s2 = "http://andrespecht.com";
    System.out.println(s2.substring(s2.indexOf('/') + 2));                      // andrespecht.com
  }
}
