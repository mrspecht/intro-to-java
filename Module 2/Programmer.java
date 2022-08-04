// Creating classes

public class Programmer {
  String name;
  String favLanguage;

  public static void main(String[] args) {
    Programmer mc = new Programmer();
    mc.name = "Andre Specht";
    mc.favLanguage = "Java";

    System.out.println("Name: " + mc.name);
    System.out.println("Favourite language: " + mc.favLanguage);
  }
}
