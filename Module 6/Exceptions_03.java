// Multi-catch

class Class {
  public static void main(String[] args) {                                      // Java intends multi-catch to be used for exceptions that aren't
    int result = 0;                                                             // related. Redundant types (class and subclass) does not compile
    try {
      int[] array = new int[2];                                                 // The order of exceptions in a multi-catch does not matter, only
      result = 10 / array[1];                                                   // that they not be subclasses of one another
    } catch (ArithmeticException | IndexOutOfBoundsException e) {
      System.out.println(e);                                                    // java.lang.ArithmeticException: / by zero
    } finally {
      // System.exit(0);                                                        // Prevents the execution of the finally block; not recommended
      System.out.println("Always executed");
    }
  }
}
