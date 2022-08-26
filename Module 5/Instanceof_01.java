// instanceof operator

interface Turbo { }
interface Speed { }
class Vehicle { }
class Car extends Vehicle implements Turbo { }

class Class {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    System.out.println(v1 instanceof Object);                                   // true
    System.out.println(v1 instanceof Vehicle);                                  // true: an object is always an instance of itself
    System.out.println(v1 instanceof Car);                                      // false
    System.out.println(v1 instanceof Turbo);                                    // false
    System.out.println(v1 instanceof Speed);                                    // false

    Car c1 = new Car();
    System.out.println(c1 instanceof Vehicle);                                  // true
    System.out.println(c1 instanceof Turbo);                                    // true

    Car c2 = null;
    System.out.println(c2 instanceof Car);                                      // false: 'null' is not an instance of any type
    System.out.println(null instanceof Car);                                    // false
    // System.out.println(c2 instanceof null);                                  // Doesn't compile!

    Car[] c3 = new Car[0];
    System.out.println(c3 instanceof Car[]);                                    // true
  }
}
