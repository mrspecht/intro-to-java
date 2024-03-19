// Chaining my own methods

public class Methods_06 {
  String name;

  public Methods_06 setName(String name) {
    this.name = name;
    // Returns the instance reference
    return this;
  }

  // Package-private access modifier: visible only within the package
  String getName() {
    return this.name;
  }

  void print() {
    System.out.println(this.getName());
  }

  public static void main(String[] args) {
    new Methods_06().setName("Andre Specht").print();
  }
}
