/*
  Module 1
  Challenge 3: display time

  Write a program that obtains minutes and remaining seconds from an amount of
  time in seconds

  Example
    500 seconds contains 8 minutes and 20 seconds
*/

public class DisplayTime {
  public static void main(String[] args) {
    int sec = 500;

    int min = sec / 60;
    int remSec = sec % 60;

    System.out.println(sec + " seconds contains " + min + " minutes and " + remSec + " seconds");
  }
}
