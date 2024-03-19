// Parsing numbers

public class Parse_01 {
  public static void main(String[] args) {
    String s1 = "2";
    String s2 = "5.6";

    int i = Integer.parseInt(s1);
    double d = Double.parseDouble(s2);

    System.out.println(i);
    System.out.println(d);

    if (Integer.parseInt(s1) == i) {
      System.out.println("They are equal");
    }
  }
}
