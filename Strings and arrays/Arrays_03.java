// Comparing arrays

import java.util.Arrays;

public class Arrays_03 {
  public static void main(String[] args) {
    int arr1[] = {3, 4, 5, 6, 7};
    int arr2[] = arr1;

    System.out.println(arr1 == arr2);
    System.out.println(arr1.equals(arr2));

    // Arrays are mutable
    arr2[0] = 0;

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));

    // The equals() method on arrays does not look a the elements of the array
    int arr3[] = new int[] {1, 2, 3, 4, 5};
    int arr4[] = new int[] {1, 2, 3, 4, 5};
    System.out.println(arr3.equals(arr4));
  }
}
