// Using the parent class' constructor

class Vehicle {
  String type;

  // Constructor with 1 argument (non-default constructor)
  Vehicle(String type) {
    this.type = type;
  }

  public String getType() { return this.type; }
}


class Car extends Vehicle {
  String brand;

  Car(String type, String brand) {
    super(type);
    this.brand = brand;
  }

  public void print() {
    System.out.println("Type: " + this.type + " | Brand: " + this.brand);
  }
}


class Motorcycle extends Vehicle {
  int speed;

  Motorcycle(String type, int speed) {
    super(type);
    this.speed = speed;
  }

  public void print() {
    System.out.println("Type: " + this.type + " | Max speed: " + this.speed);
  }
}


public class Test {
  public static void main(String[] args) {
    Car car = new Car("Car", "Ferrari");
    car.print();

    Motorcycle motorcycle = new Motorcycle("Motorcycle", 300);
    motorcycle.print();
  }
}
