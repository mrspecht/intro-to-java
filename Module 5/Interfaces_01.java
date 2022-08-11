// Interfaces

/*
  In its simplest form, an interface is like a class that contains only
  abstract methods. An interface cannot be instantiated. Instead, it is
  implemented by other classes. When a class implements an interface, the
  class must override the methods that are specified by the interface
*/

interface Processable {
  void processOne(); // public and abstract
}

class MyClass implements Processable {
  public void processOne() {
    System.out.println("Method implementation");
  }

  public void processTwo() {
    System.out.println("Class method");
  }

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    mc.processOne();
    mc.processTwo();
  }
}
