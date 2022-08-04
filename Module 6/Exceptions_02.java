// Checked exceptions

import java.util.Date;                                                          // A checked exception is any class that extends Exception but is not
import java.text.*;                                                             // a runtime exception. Checked exceptions must follow the handle or
                                                                                // declare rule where they are either caught or thrown to the caller
class Class {
  public static void main(String[] args) {                                      // The most commom checked exceptions are ParseException, IOException,
    try {                                                                       // FileNotFoundException, NotSerializableException and SQLException
      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
      Date date = sdf.parse("01-10");                                           // The most specific exception have to be caught first, otherwise a
      System.out.println(date);                                                 // compile-time error is generated
    } catch (ParseException e) {
      System.out.println(e);                                                    // java.text.ParseException: Unparseable date: '01-10'
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
