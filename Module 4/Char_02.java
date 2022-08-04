// The Character class and its methods

/*
 *  boolean isLetter(char ch)
 *  isLetter() Returns true if the argument passed into ch is an alphabetic
 *  letter. Otherwise returns false
 */

public class Char_02 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';

    System.out.println(Character.isLetter(r) ? "Letter" : "Not a letter");
    System.out.println(Character.isLetter(n) ? "Letter" : "Not a letter");
  }
}
