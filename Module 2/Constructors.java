// Constructors

/*
 *  There are two key points to note about the constructor: the name of the
 *  constructor matches the name of the class, and there’s no return type
 */

public class Constructors {
  String name;
  int age;

  // Since a constructor is coded, a default constructor isn’t supplied
  Constructors(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Overrides the toString() method of the Object class
  @Override
  public String toString() {
    return name + ", " + age;
  }

  public static void main(String[] args) {
    Constructors c = new Constructors("John", 35);

    // Prints the object
    System.out.println(c);
  }
}
