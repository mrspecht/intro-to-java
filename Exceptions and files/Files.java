// Files class

import java.io.*;
import java.nio.file.*;

class Class {
  public static void main(String[] args) throws IOException {
    Path one = Paths.get("source/java.txt");
    Path two = Paths.get("source/java.txt");
    Path dir = Paths.get("/Users/andrespecht/Courses/Dir");

    System.out.println(Files.exists(one));                                      // true
    System.out.println(one.getFileName());                                      // java.txt

    System.out.println(Files.isSameFile(one, two));                             // true
    System.out.println(Files.size(one));                                        // 12 (bytes)
    System.out.println(Files.getLastModifiedTime(one));                         // 2017-11-02T15:29:38Z (instant)
    System.out.println(Files.getOwner(one));                                    // andrespecht

    Files.createDirectory(dir);                                                 // The FileAlreadyExistsException can be thrown
    System.out.println(Files.isDirectory(dir));                                 // true
    System.out.println(Files.deleteIfExists(dir));                              // true
  }
}
