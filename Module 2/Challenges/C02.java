/*
  Module 2
  Challenge 2: temperature with methods

  Write a program that converts Celsius to Fahrenheit and Fahrenheit to
  Celsius. The program should ask the user to enter the temperatures and then
  display the results
*/

public class Converter {
  public double toFahrenheit(double c) {
    double result = c * 1.8 + 32;
    return result;
  }

  public double toCelsius(double f) {
    double result = (f - 32) * 5 / 9;
    return result;
  }

  public static void main(String[] args) {
    double c = 23.0;
    double f = 73.40;

    double cToF = new Class().toFahrenheit(c);
    double fToC = new Class().toCelsius(f);

    System.out.println(String.format("%.2f\u00B0C is %.2f\u00B0F", c, cToF));
    System.out.println(String.format("%.2f\u00B0F is %.2f\u00B0C", f, fToC));
  }
}
