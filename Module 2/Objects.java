// Objects

/*
 *  An object, in object-oriented programming (OOP), is an abstract data type
 *  created by a developer. It can include multiple properties and methods and
 *  may even contain other objects
 *
 *  An object is an instance of a class
 */

class Class {
  String name;
  int id;

  public static void main(String[] args) {
    Class c = new Class();
    c.name = "Customer";
    c.id = 46829;
    System.out.println(c.name + ", " + c.id);
  }
}
