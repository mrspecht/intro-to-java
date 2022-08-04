// The Character class and its methods

/*
 *  The Character class is a wrapper class for the char data type. It provides
 *  numerous methods for testing and converting character data
 *
 *  boolean isDigit(char ch)
 *  isDigit() returns true if the argument passed into ch is a digit from 0
 *  through 9
 */

public class Char_01 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';

    System.out.println(Character.isDigit(r) ? "Number" : "Not a number");
    System.out.println(Character.isDigit(n) ? "Number" : "Not a number");
  }
}
