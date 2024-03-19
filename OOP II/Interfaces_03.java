// Interfaces

interface Processable {
  void processOne();

  default void processTwo() {
    System.out.println("Interface's default method");
  }
}

class MyClass implements Processable {
  public void processOne() {
    System.out.println("Method implementation");
  }

  public void processTwo() {                                                    // Calls Processable's default method
    Processable.super.processTwo();                                             // [InterfaceName].super.[defaultMethod]
  }

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    mc.processOne();
    mc.processTwo();
  }
}
