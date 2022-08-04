/*
  Module 1
  Challenge 1: stocks

  Anthony bought 300 shares of stock at a price of $21.75 per share. He must
  pay his stock-broker a 2 percent commission for the transaction. Write a
  program that calculates and displays the following:

  The amount paid for the stock alone (without the commission)
  The amount of the commission
  The total amount paid (for the stock plus the commission)
*/

public class Stocks {
  public static void main(String[] args) {
    int shares = 300;
    double stockPrice = 21.75;
    double commission = .02;

    double totalStockPrice = shares * stockPrice;
    double totalCommission = totalStockPrice * commission;
    double totalPaid = totalStockPrice + totalCommission;

    System.out.println("Stocks: $" + totalStockPrice);
    System.out.println("Commission: $" + totalCommission);
    System.out.println("Total: $" + totalPaid);
  }
}
