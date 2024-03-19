// Copying an array

import java.util.Arrays;

public class Arrays_06 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = a;

    // Cloning array 'a'
    int[] c = a.clone();

    b[0] = 999;

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));

    // Copies an array from the specified source array
    int[] d = new int[a.length];
    System.arraycopy(c, 0, d, 0, c.length);

    System.out.println(Arrays.toString(d));
  }
}
