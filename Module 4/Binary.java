// Parsing numbers

import java.util.*;

public class Binary {
  public static void main(String[] args) {
    System.out.println(Integer.toBinaryString(5));
    System.out.println(Integer.toBinaryString(15));
    System.out.println(Integer.toBinaryString(255));

    System.out.println(Integer.parseInt("101", 2));
    System.out.println(Integer.parseInt("1111", 2));
    System.out.println(Integer.parseInt("11111111", 2));
  }
}
