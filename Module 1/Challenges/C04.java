/*
  Module 1
  Challenge 4: conversions

  Write a program that removes the integer part from a double and prints the
  remaining value

  Example
    4.7 prints 0.7
*/

public class C04 {
  public static void main(String[] args) {
    double num = 4.7;
    double res = num - (int) num;
    System.out.println(String.format("%.1f", res));
  }
}
