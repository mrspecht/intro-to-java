// Exercise 4

import java.util.*;

class Capitalizer {
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
    scan.close();
  }
}
