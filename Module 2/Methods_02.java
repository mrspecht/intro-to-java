// Creating methods

/*
 *  An argument is a value passed to a method when the method is called. A
 *  parameter is a variable used to define a particular value during af method
 *  definition
 */

public class Methods_02 {
  double result;

  public double convert(int celsius) {
    this.result = celsius * 1.8 + 32;
    return result;
  }

  public void print(int celsius, double fahrenheit) {
    String formatted = String.format("%.2f", fahrenheit);
    System.out.println(celsius + "\u00B0C = " + formatted + "\u00B0F");
  }

  public static void main(String[] args) {
    int celsius = 16;
    Methods m = new Methods();
    m.print(celsius, m.convert(celsius));
  }
}
