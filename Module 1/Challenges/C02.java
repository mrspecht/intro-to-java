/*
  Module 1
  Challenge 2: temperature

  Write a program that converts Celsius to Fahrenheit and Fahrenheit to Celsius

  Example
    23.0 Celsius is 73.4 Fahrenheit
    73.4 Fahrenheit is 23.0 Celsius

  Formulas
    Celsius to Fahrenheit: temp * 1.8 + 32
    Fahrenheit to Celsius: (temp - 32) * 5 / 9
*/

public class Temperature {
  public static void main(String[] args) {
    double celsius = 23.0;
    double fahrenheit = 73.4;
    double resultC = 0.0;
    double resultF = 0.0;

    resultF = celsius * 1.8 + 32;
    System.out.println(celsius + " Celsius is " + resultF + " Fahrenheit");

    resultC = (fahrenheit - 32) * 5 / 9;
    System.out.println(fahrenheit + " Fahrenheit is " + resultF + " Celsius");
  }
}
