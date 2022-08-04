// Garbage collection (object's lifecycle)

/*
 *  Garbage collection refers to the process of automatically freeing memory on
 *  the heap by deleting objects that are no longer reachable in your program
 */

public class GC {
  public static void main(String[] args) {
    String str1 = new String("One");
    String str2 = new String("Two");
    String str3 = new String("Three");
    String str4 = str3;

    str2 = str3;
    str1 = null;
    // 'One' and 'Two' became unreachable, and eligible for GC
  }
}
