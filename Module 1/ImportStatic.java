// The import static statement

/*
  The static import declaration imports static members from classes, allowing
  them to be used without class qualification
*/

import java.util.*;
import static java.lang.System.*;

public class ImportStatic {
  public static void main(String[] args) {
    out.println(new Random().nextInt(10));
    out.println(Integer.MAX_VALUE);
    out.println(Integer.TYPE);
    out.println(Math.PI);
  }
}
