// Constants

/*
  The final key word can be used in a variable declaration to make the
  variable a named constant. Named constants are initialized with a value,
  and that value cannot change during the execution of the program
*/

public class Constants {
  public static void main(String[] args) {
    final int ID = 445566;
    final String FIRST_NAME = "Andre";

    // Error: cannot assign a value to final variable
    // FIRST_NAME = "John";

    System.out.println(ID);
    System.out.println(FIRST_NAME);
  }
}
