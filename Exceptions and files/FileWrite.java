// Write

import java.io.*;
import java.time.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.time.format.*;

class Class {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("source", "output.txt");
    Charset charset = Charset.forName("UTF-8");

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss (dd/MM/yyyy)");

    try (BufferedWriter br = Files.newBufferedWriter(path, charset)) {
      String content = "Last update: " + dtf.format(now);
      br.write(content);
    }
  }
}
