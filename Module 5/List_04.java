// ArrayList

import java.util.*;

public class ArrayList_04 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Teddy, John, Henry");

    for (String str : list) {
      System.out.println(str);
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.forEach(System.out::println);
  }
}