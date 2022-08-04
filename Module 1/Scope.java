// Variable scope

public class Scope {
  // Instance variables have default values
  String name;
  int age;

  public static void main(String[] args) {
    // Local variables must be initialized before use
    String job = "Instructor";

    int x = 5;
    if (x > 0) {
      int y = 10;
    }

    // Error: cannot find symbol
    // System.out.println(y);
  }
}
