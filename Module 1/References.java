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

    System.out.println(str1);
    System.out.println(str3);

    Reference ref1 = new Reference();
    Reference ref2 = new Reference();

    System.out.println(ref1);
  }
}
