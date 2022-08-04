// The Array class and its methods (part 2)

/*
 *  When a value is not found, the program determines its probable position,
 *  negates it and subtracts 1
 */

import java.util.Arrays;

public class Arrays_01 {
  public static void main(String[] args) {
    int[] a = {3, 2, 1, 5, 4};
    Arrays.sort(a);

    System.out.println(Arrays.binarySearch(a, 2));  // 1

    System.out.println(Arrays.binarySearch(a, 5));  // 4

    System.out.println(Arrays.binarySearch(a, 7));  // -6 (-5 -1 == -6)

    System.out.println(Arrays.binarySearch(a, -4)); // -1 (0 -1 == -1)
  }
}
