// Read

import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

class Class {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("source", "continents.txt");
    Charset charset = Charset.forName("UTF-8");
    String line = null;

    try (BufferedReader br = Files.newBufferedReader(path, charset)) {
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    }
  }
}
