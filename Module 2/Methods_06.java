// Chaining my methods

public class Methods_06 {
  String name;

  public Methods setName(String name) {
    this.name = name;
    // Returns the instance reference
    return this;
  }

  public String getName() {
    return this.name;
  }

  public void print() {
    System.out.println(this.getName());
  }

  public static void main(String[] args) {
    new Methods().setName("Andre Specht").print();
  }
}
