// Parameters and arguments

public class Methods_03 {
  public static void main(String[] args) {
    int result = 0;

    for (int i = 0; i < args.length; i++) {
      result += Integer.parseInt(args[i]);
    }
    System.out.println(result);
  }
}
