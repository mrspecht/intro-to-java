// Interfaces

interface Processable {
  void process();
}

interface Iteratable {
  void iteration();
}

class MyClass implements Processable, Iteratable {
  public void process() {
    System.out.println("Impementing process()");
  }

  public void iteration() {
    System.out.println("Impementing iteration()");
  }

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    mc.process();
    mc.iteration();
  }
}
