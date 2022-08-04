/*
  Introduction to Java programming
  Assignment 1
  Project 2
  Andre Specht
 */

import java.util.*;
import java.math.*;

public class Population {
  public static double format(double result) {
    return new BigDecimal(result).setScale(2, RoundingMode.DOWN).doubleValue();
  }

  public static void main(String[] args) {
    double organisms = 0.0, increase = 0.0, result = 0.0;
    int days = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of organisms: ");
    organisms = input.nextInt();

    System.out.print("Enter the average daily increase: ");
    increase = input.nextDouble();

    System.out.print("Enter the number of days they will multiply: ");
    days = input.nextInt();

    if (organisms >= 2 && increase >= 0 && days >= 1) {
      System.out.println("Day 1: " + organisms + " organisms");

      for (int i = 1; i < days; i++) {
        result = organisms + (organisms * (increase / 100));
        System.out.println("Day " + (i + 1) + ": " + format(result) + " organisms");
        organisms = result;
      }
    } else {
      System.out.println("\nPlease check the minimum values and try again");
      System.out.println("Organisms: >= 2; Average >= 0; Days >= 1");
    }

    input.close();
  }
}
