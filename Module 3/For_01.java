// The for statement

/*
  for (initialization; booleanExpression; updateStatement) {
    statement;
*/

public class For_01 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
