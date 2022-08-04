/*
 * Introduction to Java programming
 * Assignment 2
 * Project 1
 * Andre Specht
 */

import java.util.*;

public class Coin {
  private String sideUp;

  public Coin() {
    int num = new Random().nextInt(2);
    if (num == 0) {
      sideUp = "Heads";
    } else {
      sideUp = "Tails";
    }
  }

  public void toss() {
    int num = new Random().nextInt(2);
    if (num == 0) {
      sideUp = "Heads";
    } else {
      sideUp = "Tails";
    }
  }

  public String getSideUp() {
    return this.sideUp;
  }

  public static void main(String[] args) {
    int tails = 0;
    int heads = 0;

    Coin coin = new Coin();

    System.out.println("Coin is current on " + coin.getSideUp().toLowerCase());
    System.out.println("Tossing coin...\n");

    for (int i = 1; i <= 10; i++) {
      coin.toss();
      System.out.println("#" + i + "\t" + coin.getSideUp());
      if (coin.getSideUp().equals("Tails")) {
        tails++;
      } else {
        heads++;
      }
    }

    System.out.println("\nHeads wins: " + heads);
    System.out.println("Tails wins: " + tails);
  }
}
