// Reference types

/*
  A reference type refers to an object. Unlike primitive types that hold
  their values in the memory where the variable is allocated, reference types
  point to an object by storing the memory address where the object is
  located
*/

public class References {
  public static void main(String[] args) {
    String str1 = new String("One");
    String str2 = new String("Two");
    String str3 = null;

    System.out.println(str1);  // One
    System.out.println(str2);  // Two
    System.out.println(str3);  // null

    References ref1 = new References();
    References ref2 = new References();

    System.out.println(ref1);  // References@27d415d9
  }
}
