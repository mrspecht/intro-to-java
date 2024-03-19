// Intro to inheritance

/*
  Inheritance allows a new class to extend an existing class. The new class
  inherits the members of the class it extends

  Child class -> extends -> parent class
  Vehicle -> Car, Airplane, Motorcycle
  Person -> Man, Woman, Child, Employee
*/

class Employee {
  int id;
  String name;

  public void print() {
    System.out.println("ID: " + id + " | Name: " + name);
  }
}


class Driver extends Employee {

}

class Manager extends Employee {

}

public class Intro {
  public static void main(String[] args) {
    Driver driver = new Driver();
    driver.id = 66790;
    driver.name = "John Stevens";
    driver.print();

    Manager manager = new Manager();
    manager.id = 38723;
    manager.name = "Susie Thompson";
    manager.print();
  }
}
