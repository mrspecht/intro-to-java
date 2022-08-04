/*
 * Introduction to Java programming
 * Assignment 1
 * Project 1
 * Andre Specht
 */

import java.util.*;

public class Discount {
  public void checkDiscount(String job, double item) {
    double discount = 0.0;

    switch(job) {
      case "supervisor":
        discount = item * 0.9;
        System.out.println("Price after discount: " + String.format("$%.2f", discount));
        break;
      case "rep":
        discount = item * 0.85;
        System.out.println("Price after discount: " + String.format("$%.2f", discount));
        break;
      default:
        discount = item * 0.8;
        System.out.println("Price after discount: " + String.format("$%.2f", discount));
    }
  }

  public static void main(String[] args) {
    String job;
    double price;
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the discount system");
    System.out.print("Enter your job title: ");
    job = input.nextLine().toLowerCase();

    if (job.equals("manager")) {
      System.out.println("Managers cannot participate in the discount system");
    } else {
      System.out.print("Enter the price of the item you want: ");
      price = input.nextDouble();
      new Discount().checkDiscount(job, price);
    }

    input.close();
  }
}
