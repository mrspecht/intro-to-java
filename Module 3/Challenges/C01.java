/*
  Module 3
  Challenge 1: loops

  Use nested for loops to initialize a 3 x 4 x 5 multidimentional array
  Use enhanced for loops to print the array
*/

public class C01 {
  public static void main(String[] args) {
    int[][][] a = new int[3][4][5];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        for (int k = 0; k < a[i][j].length; k++) {
          a[i][j][k] = i + j + k;
        }
      }
    }

    System.out.println(a.length);
    System.out.println(a[0].length);
    System.out.println(a[0][0].length);
  
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
