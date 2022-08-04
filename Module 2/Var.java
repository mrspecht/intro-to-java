// Local variable type inference

/*
 *  Starting in Java 10, you have the option of using the keyword 'var' instead
 *  of the type for local variables. The compiler determine the type for you
 */

public class Var {
  public void doSomething() {
    // Must be initialized
    var name = "Andre";
    var num = 15;

    System.out.println(name);
    System.out.println(num);
  }

  public static void main(String[] args) {
    new Var().doSomething();
  }
}
