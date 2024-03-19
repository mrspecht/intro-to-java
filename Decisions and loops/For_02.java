// The enhanced for (for-each)

/*
  The enhanced for loop is designed to iterate once for every element in an
  array. Each time the loop iterates, it copies an array element to a
  variable

  for (type elementVar : array)
    statement;
*/

public class For_02 {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Charles";
    names[2] = "Henry";

    for (String n : names)
      System.out.println(n + " ");
  }
}
