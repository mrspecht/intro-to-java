/*
 * Introduction to Java programming
 * Assignment 1
 * Project 3
 * Andre Specht
 */

import java.util.*;

public class Converter {
  public void showKilometers(double meters) {
    double km = meters * 0.001;
    System.out.printf("%.2f meters is %.3f kilometers\n\n", meters, km);
  }

  public void showInches(double meters) {
    double in = meters * 39.37;
    System.out.printf("%.2f meters is %.3f inches\n\n", meters, in);
  }

  public void showFeet(double meters) {
    double ft = meters * 3.281;
    System.out.printf("%.2f meters is %.3f feet\n\n", meters, ft);
  }

  public void menu() {
    System.out.println("1. Convert to kilometers");
    System.out.println("2. Convert to inches");
    System.out.println("3. Convert to feet");
    System.out.println("4. Quit the program");
  }

public static void main(String[] args) {
  double meters = 0;
  int choice = 0;
  boolean flag = true;
  Scanner input = new Scanner(System.in);

  do {
    System.out.print("Enter a distance in meters: ");
    meters = input.nextDouble();
    System.out.println();

    if (meters < 0) {
      System.out.println("Negative numbers are not valid. Try again\n");
      return;
    }

    new Converter().menu();
    System.out.println();
    System.out.print("Enter your choice: ");
    choice = input.nextInt();
    System.out.println();

    switch(choice) {
      case 1:
        new Converter().showKilometers(meters);
        break;
      case 2:
        new Converter().showInches(meters);
        break;
      case 3:
        new Converter().showFeet(meters);
        break;
      case 4:
        flag = false;
        break;
      }
    } while (flag);

    input.close();
  }
}
