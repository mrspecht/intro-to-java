// The String class and its methods

public class Strings_02 {
  public static void main(String[] args) {
    String s1= "Ja";
    String s2 = "va";
    String str = s1.concat(s2);
    System.out.println(str);

    System.out.println(str.length());                                           // length() returns the number of characters in the string
    // Strings are not arrays
    // System.out.println(str[2]);

    str.replace("va", "ck");                                                    // These methods don't change the original string
    System.out.println(str);

    System.out.println(str.contains("b"));                                      // contains() looks for matches in the string
    System.out.println(str.startsWith("j"));                                    // startsWith() and endsWith() methods look at whether the
  	System.out.println(str.startsWith("J"));                                    // provided value matches part of the string
    System.out.println(str.endsWith("a"));
    System.out.println(str.replace('J', 'j'));                                  // replace() does a simple search and replace on the string
    System.out.println(str);
  }
}
