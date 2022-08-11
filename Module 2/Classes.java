// Classes and objects

/*
  A class is an abstract blueprint used to create more specific, concrete
  objects. Classes often represent broad categories, like Car or Dog that
  share attributes. These classes define what attributes an instance of this
  type will have, like colour, but not the value of those attributes for a
  specific object
 */

import java.util.*;
import static java.lang.System.*;

public class Classes {
  public static void main(String[] args) {
    String name = new String("Hello Java");
    System.out.println(name);
    System.out.println(name.toUpperCase());
    System.out.println(name.length());

    Random rand = new Random();
    out.println(rand.nextInt(10)); // 1 to 9
    out.println(rand.nextDouble()); // 0.0 to 0.999999
    out.println(String.format("%.2f", rand.nextDouble()));
  }
}
