// Exercise 3

public class Opposite {
  public static void fifties(int[] array) {
    int last = array.length - 1;
    int medium = array.length / 2;

    for (int i = 0; i < medium; i++) {
      boolean result = (array[i] + array[last - i] == 50) ? true : false;
      System.out.println(array[i] + " + " + array[last - i] + " = " + (array[i] + array[last - i]) + " - " + result);
    }
  }
  public static void main(String[] args) {
    int[] numbers = { 40, 17, 28, 31, 41, 12, 19, 27, 38, 40, 18, 22, 33, 11 };
    fifties(numbers);
  }
}