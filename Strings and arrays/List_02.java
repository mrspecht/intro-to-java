// ArrayList

import java.util.*;

public class ArrayList_02 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("A");                                                           // Adds an element and returns a boolean (append)
    list.add("C");
    list.add(1, "B");
    System.out.println(list);

    String letter = list.remove(1);
    System.out.println(letter);

    list.set(0, "Z");                                            // set() means replace
    System.out.println(list.get(0));

    // We don't need the 'toString()' method to print a list
    System.out.println(list);
  }
}
