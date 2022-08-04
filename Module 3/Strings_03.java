// The String class and its methods

public class Strings_03 {
  public static void main(String[] args) {
    String str = "Winnipeg";

    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    System.out.println(str.equals("WINNIPEG"));                                 // equals() method checks whether two strings contain exactly
    System.out.println(str.equalsIgnoreCase("Winnipeg"));                       // the same characters in the same order

    System.out.println(str.indexOf('p'));                                       // indexOf() looks at the characters in the string and finds the
    System.out.println(str.indexOf("nn"));                                      // first index that matches the value. This method returns -1
    System.out.println(str.indexOf('a'));                                       // when no match is found

    System.out.println(str.charAt(4));                                          // charAt() lets us query the string to find out what character
                                                                                // is at a specific index. This method throws an exception when
  }                                                                             // something goes wrong
}
