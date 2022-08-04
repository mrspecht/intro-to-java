/*
  Module 3
  Challenge 1: loops

  Print the elements of the following multidimensional array using the
  'enhanced for'
*/

public class Loops {
  public static void main(String[] args) {
    int[][][] a = new int[3][4][4];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        for (int k = 0; k < a[i][j].length; k++) {
          a[i][j][k] = i + j + k;
        }
      }
    }

    for (int[][] arr1 : a) {
      for (int[] arr2 : arr1) {
        for (int elem : arr2) {
          System.out.print(elem + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
