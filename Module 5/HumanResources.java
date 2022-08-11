// Inheritance

class Employee {
  int id;
  String name;
}

class Driver extends Employee {
  public void jobTitle() { System.out.println("I am a driver"); }

  @Override
  public String toString() {
    return "Name: " + this.name + " | Id: " + this.id;
  }
}

class Supervisor extends Employee {
  public void jobTitle() { System.out.println("I am a supervisor"); }

  @Override
  public String toString() {
    return "Name: " + this.name + " | Id: " + this.id;
  }
}

public class HumanResources {
  public static void main(String[] args) {
    Driver driver = new Driver();
    driver.id = 1234;
    driver.name = "Jerry";

    System.out.println(driver);

    Supervisor supervisor = new Supervisor();
    supervisor.id = 5678;
    supervisor.name = "Mary";

    System.out.println(supervisor);
  }
}