// Overriding equals()

class MyEquals {
  String name;

  MyEquals(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof MyEquals) {
      MyEquals otherObj = (MyEquals) obj;
      return this.name == otherObj.name;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    MyEquals eq1 = new MyEquals("Andre");
    MyEquals eq2 = new MyEquals("Andre");
    System.out.println(eq1.equals(eq2));
  }
}
