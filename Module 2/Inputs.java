// Reading inputs (the Scanner class)

/*
 *  The Scanner class has methods for reading strings, bytes, integers, long
 *  integers, short integers, floats, and doubles
 */

import java.util.*;

public class Inputs {
  String fullName;
  int age;

  public static void main(String[] args) {
    Inputs in = new Inputs();
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your name: ");
    in.fullName = scan.nextLine();

    System.out.print("Enter your age: ");
    in.age = scan.nextInt();

    System.out.println("Thank you, " + in.fullName);
    scan.close();
  }
}
