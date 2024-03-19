// Method overriding

/*
  A subclass may have a method with the same signature as a superclass method.
  In such a case, the subclass method overrides the superclass method

  The '@Override' annotation denotes that the child class method overrides
  the base class method
*/

class Programmer {
  double salary;

  // Add 'final' and run it again
  public void setPromo(double salary) {
    this.salary = salary + (salary * .10);
  }

  public double getPromo() {
    return this.salary;
  }
}

class Senior extends Programmer {
  // @Override
  public void setPromo(double salary) {
    this.salary = salary + (salary * .20);
  }
}

public class Overriding {
  public static void main(String[] args) {
    Senior senior = new Senior();
    senior.setPromo(5000);
    System.out.println(senior.getPromo());
  }
}
