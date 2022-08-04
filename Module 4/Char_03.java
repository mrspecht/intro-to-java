// The Character class and its methods

/*
 *  boolean isLetterOrDigit(char ch)
 *  isLetterOrDigit() returns true if the character passed into ch contains a
 *  digit (0 through 9) or an alphabetic letter. Otherwise returns false
 */

public class Char_03 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';

    System.out.println(Character.isLetterOrDigit(r) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(n) ? "Valid" : "Not valid");
  }
}
