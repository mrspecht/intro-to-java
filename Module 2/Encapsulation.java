// Encapsulation

/*
 *  In Java, encapsulation is commonly implemented with private instance
 *  members that have public methods to retrieve or modify the data, commonly
 *  referred to as getters and setters, respectively
 */

public class Encapsulation {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Encapsulation e = new Encapsulation();
    e.setName("John");
    e.setAge(35);
    System.out.println(e.getName() + ", " + e.getAge());
  }
}
