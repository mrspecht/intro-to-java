// Read

import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

class Class {
  public static void main(String[] args) throws IOException {                   // The NIO.2 API includes methods for reading and writing file
    Path path = Paths.get("source", "quotes.txt");                              // contents using java.io.streams
    Charset charset = Charset.forName("UTF-8");
    String pattern = "\\s*(\\s|,|\\.)\\s*";
    String line = null;

    try (BufferedReader br = Files.newBufferedReader(path, charset)) {          // newBufferedReader() reads the file specified at the path location
      while ((line = br.readLine()) != null) {                                  // It also requires a Charset value to determine what character
        for (String word : line.split(pattern))                                 // encoding to use to read the file
          System.out.println(word);
      }
    }
  }
}
