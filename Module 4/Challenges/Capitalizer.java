/*
  Module 4
  Challenge 1

  Write a method that accepts a String as an argument and returns a copy of
  the string with the first character of each sentence capitalized

  Input: hello. my name is Joe. what is your name?
  Output: Hello. My name is Joe. What is your name?
*/

import java.util.*;

public class Capitalizer {
  public String capitalize(String str) {
    int period = str.indexOf(".");
    char[] chars = str.toCharArray();
    String string = "";
    chars[0] = Character.toUpperCase(chars[0]);

    while (period != -1) {
      chars[period + 2] = Character.toUpperCase(chars[period + 2]);
      period = str.indexOf(". ", period + 1);
    }

    for (char c : chars) {
      string += c;
    }

    return string;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a phrase to be capitalized: ");
    String sentence = scan.nextLine();
    System.out.println(new Capitalizer().capitalize(sentence));
  }
}
