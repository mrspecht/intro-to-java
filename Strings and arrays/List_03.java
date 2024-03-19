// ArrayList

import java.util.*;

public class ArrayList_03 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("John");
    list.add("Steve");
    list.add("Martin");

    System.out.println(list.indexOf("Martin"));
    System.out.println(list.lastIndexOf("Jack"));

    System.out.println(list);
  }
}