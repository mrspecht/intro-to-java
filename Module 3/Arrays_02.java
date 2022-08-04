// Looping through a multidimensional array

public class Arrays_02 {
  public static void main(String[] args) {
    int[][] grid = {
      {11, 12, 13, 14},
      {21, 22, 23, 24},
      {31, 32, 33, 34},
      {41, 42, 43, 44}
    };

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(grid[i][j] + " ");
      }
    System.out.println();
    }
  }
}
