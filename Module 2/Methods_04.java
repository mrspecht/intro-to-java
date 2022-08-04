// Method overloading

/*
 * Method overloading occurs when there are different method signatures with
 * the same name but different type parameters. Overloaded methods may have
 * different access modifiers and return types
 */

public class Methods_04 {
  public static void numbers(int a) {
    System.out.println("1 argument");
  }

  public static void numbers(int a, int b) {
    System.out.println("2 arguments");
  }

  public static void numbers(int[] array) {
    System.out.println("A lot of arguments");
  }

  public static void main(String[] args) {
    numbers(3);
    numbers(5, 7);

    int[] numbers = {1, 2, 3, 4, 5, 6};
    // int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
    numbers(numbers);
  }
}
