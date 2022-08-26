// instanceof operator

interface Animal { }                                                            // Java waits until runtime to check the interface
class Tiger { }
class Cat { }

class Class {
  public static void main(String[] args) {
    Cat cat = new Cat();
    Tiger tiger = new Tiger();
    System.out.println(cat instanceof Animal);                                  // false
    // System.out.println(cat instanceof Tiger);                                // Doesn't compile!
  }
}
