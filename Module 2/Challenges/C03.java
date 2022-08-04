/*
  Module 2
  Challenge 3: area

  Write a program that calculates the circumference of a circle based on the
  radius (in cm) entered by the user. Instance variables must be accessed
  through getters and setters/constructor

  Formula: Math.PI * (Math.pow(radius, 2));

  Example
    Enter radius in cm: 2.39
    Area of the circumference is 17.95 cm
*/

import java.util.*;
import java.lang.Math.*;

public class C03 {
  private double radius;

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double getArea() {
    double area = Math.PI * (Math.pow(radius, 2));
    return area;
  }

  public static void main(String[] args) {
		double r = 0.0;

		System.out.print("Enter radius in cm: ");
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble();

		C03 area = new C03();
    area.setRadius(r);

		System.out.printf("Area of the circumference is %.2f cm\n", area.getArea());
		scan.close();
	}
}
