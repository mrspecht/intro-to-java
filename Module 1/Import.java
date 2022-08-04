// The import statement

/*
  The import statement allows you to import an entire package or use only
  certain classes and interfaces defined in the package. The 'java.lang'
  package is available by default

  The static import declaration imports static members from classes, allowing
  them to be used without class qualification
*/

import java.util.*;

public class Import {
  public static void main(String[] args) {
    System.out.println(new Random().nextInt(10));
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.TYPE);
    System.out.println(Math.PI);
  }
}
