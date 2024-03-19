// Path methods

// A Java Path instance represents a path in the file system. A path can point
// to either a file or a directory

import java.nio.file.*;

class Class {
  public static void main(String[] args) {
    Path path = Paths.get("source/java.txt");

    System.out.println(path.toString());                                        // source/java.txt
    System.out.println(path.isAbsolute());                                      // true
    System.out.println(path.getFileName());                                     // java.txt
    System.out.println(path.getNameCount());                                    // 2

    System.out.println(path.getName(0));                                 // source
    System.out.println(path.getName(1));                                 // java.txt
  }
}
