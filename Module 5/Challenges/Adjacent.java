// Exercise 2

public class Adjacent {
  public static void tens(int[] array) {    
    for (int i = 0; i < array.length - 1; i++) {
      boolean result = (array[i] + array[i + 1] == 10) ? true : false;
      System.out.println(array[i] + " + " + array[i + 1] + " = " + (array[i] + array[i + 1]) + " - " + result);
    }
  }
  public static void main(String[] args) {
    int[] numbers = { 7, 4, 6, 5, 5, 3, 8, 1, 9, 6, 2, 8 };
    tens(numbers);
  }
}
