// Exercise 1

public class Millionaire {
  public static void main(String[] args) {
    int balance = 10_000;
    final int HUNDRED = 100_000;
    final int MILLION = 1_000_000;
    int years = 0;
    boolean reachHundred = false;

    while (balance <= MILLION) {
      if (!reachHundred && balance >= HUNDRED) {
        System.out.println("It takes " + years + " years to reach $100,000");
        reachHundred = true;
      }

      years++;
      balance *= 2;
    }

    System.out.println("It takes " + years + " years to reach $1,000,000");
  }
}
