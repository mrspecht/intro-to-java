import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.regex.*;

public class Emails {
  private static Pattern pattern;
  private static Matcher matcher;
  private static final String EMAIL_PATTERN = "^(?=^.{8,}$)[A-Za-z0-9]+([_.-][a-zA-Z0-9]+)" +
    "*@[A-Za-z0-9]+([.-][a-zA-Z0-9]+)*\\.[A-Za-z]{2,}$";

  public static boolean match(String email) {
    pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
    matcher = pattern.matcher(email);
    return matcher.matches();  // true | false
  }

  public static void main(String[] args) {
    final Path EMAILS = Paths.get("source/emails.txt");
    final String HOME = System.getProperty("user.home");
    final Path VALID = Paths.get(HOME + "/Downloads/valid.txt");
    final Charset CHARSET = Charset.forName("UTF-8");

    String line = null;
    
    try (BufferedReader reader = Files.newBufferedReader(EMAILS, CHARSET);
         BufferedWriter writer = Files.newBufferedWriter(VALID, CHARSET)) {
      while ((line = reader.readLine()) != null) {
        if (match(line)) {
          writer.write(line + "\n");
          System.out.println(line);
        }
      }
    } catch (IOException e) {
      e.getMessage();
    }
  }
}
