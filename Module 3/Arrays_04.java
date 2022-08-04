// The Array class and its methods

import java.util.Arrays;
import static java.util.Arrays.*;

public class Arrays_04 {
  public static void main(String[] args) {
    int[] a = {3, 2, 6, 1, 5, 4};
    String[] b = {"John", "Anna", "Mary", "Edward"};

    Arrays.sort(a);
    Arrays.sort(b);

    System.out.println(a.length + " elements: " + Arrays.toString(a));
    System.out.println(b.length + " elements: " + Arrays.toString(b));
  }
}
