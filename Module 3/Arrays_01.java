// The Array class

/*
  Arrays are homogeneous data structures that are implemented as objects.
  They are mutable, have fixed size and can be multidimensional
*/

import java.util.*;

public class Arrays_01 {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5};
    int[] a2 = new int[5];

    String[] a3 = {"John", "Jack", "Jeremy"};
    String[] a4 = new String[3];

    // Prints the hash code
    System.out.println(a1);

    // Prints the array
    System.out.println(Arrays.toString(a1));
  }
}
