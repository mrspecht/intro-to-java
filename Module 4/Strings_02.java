// The String class and its methods (part 2)

public class Strings_02 {
  public static void main(String[] args) {
    String empty = "";
    String blank = "    ";
    String name = "Andre";

    System.out.println(empty.isEmpty());
    System.out.println(blank.isEmpty());
    System.out.println(blank.isBlank());

    System.out.println(name.isEmpty());
    System.out.println(name.isBlank());

    // Validation
    if (!name.isBlank()) {
      System.out.println("Name is valid");
    }
  }
}
