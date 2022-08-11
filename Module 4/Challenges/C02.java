// Press 'q' to quit

/*
  Module 4
  Challenge 2

  Write a program that asks for your favourite food until you hit 'q' (to quit)
*/

import java.util.*;

class Quit {
  public static void main(String[] main) {
    // Local variables must be initialized
    String fruit = "";
    int count = 1;
    Scanner scan = new Scanner(System.in);

    do {
      System.out.print("Enter your favourite fruit (" + count +"): ");
      fruit = scan.nextLine();
      count++;
    } while(!fruit.equals("q"));

    scan.close();
  }
}

