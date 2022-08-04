// Runtime exceptions

/*
 *  An exception is an object that is generated as the result of an error or
 *  an unexpected event. To prevent exceptions from crashing your program, you
 *  must write code that detects and handles them
 */

class Class {                                                                   // An exception is an event that occurs during the execution of a
  public static void main(String[] args) {                                      // program that disrupts the normal flow of instructions
    try {
      int[] array = {1, 2, 3};                                                  // Three positions
      for (int i = 0; i <= array.length; i++) {                                 // Four positions (0-3)
        array[i] = i + 1;
        System.out.println(array[i]);
      }                                                                         // Runtime exceptions (unchecked) may be caught, but is not required
    } catch (ArrayIndexOutOfBoundsException e) {                                // that it be caught
      System.out.println(e);                                                    // java.lang.ArrayIndexOutOfBoundsException: 3
    }
  }
}
