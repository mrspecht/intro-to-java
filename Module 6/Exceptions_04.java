// Try-with-resources

import java.io.*;

class Class {
  public static void main(String[] args) throws IOException {                   // The try-with-resources statement automatically closes all resources
    File file = new File("source/text.txt");                          // opened in the try clause (automatic resource management). In other
                                                                                // words, before any catch block
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      String content = "Try-with-resources";
      bw.write(content);
    }                                                                           // catch and finally blocks are not mandatory in try-with-resources
  }
}
