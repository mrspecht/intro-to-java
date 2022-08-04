/*
 * Introduction to Java programming
 * Assignment 2
 * Project 2
 * Andre Specht
 */

class Person {
  private String name, address, phone;

  Person() { }

  Person(String name, String address, String phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
  }

  public void setName(String name) { this.name = name; }
  public String getName() { return this.name; }

  public void setAddress(String address) { this.address = address; }
  public String getAddress() { return this.address; }

  public void setPhone(String phone) { this.phone = phone; }
  public String getPhone() { return this.phone; }
}


class Customer extends Person {
  private int customerNumber;
  private boolean preference;

  Customer() { }

  Customer(String name, String address, String phone,
           int number, boolean preference) {
    super(name, address, phone);
    this.customerNumber = number;
    this.preference = preference;
  }

  public void setNumber(int num) { this.customerNumber = num; }
  public void setPreference(boolean pref) { this.preference = pref; }

  public String getPreference() {
    String str;
    if (this.preference) {
      str = "Yes";
    } else {
      str = "No";
    }
    return str;
  }

  public String toString() {
    String data = "Number: " + this.customerNumber + "\n" +
                  "Name: " + getName() + "\n" +
                  "Address: " + getAddress() + "\n" +
                  "Phone: " + getPhone() + "\n" +
                  "Mailing list: " + getPreference();
    return data;
  }
}


public class MailingList {
  public static void main(String[] args) {
    Customer costumer1 = new Customer("John Smith", "123 Notre Dame Ave",
      "(204) 234-5678", 1859, false);

    Customer costumer2 = new Customer();
    costumer2.setNumber(2960);
    costumer2.setName("Mary Helen");
    costumer2.setAddress("255 Sesame St.");
    costumer2.setPhone("(204) 455-9632");
    costumer2.setPreference(true);

    System.out.println(costumer1);
    System.out.println();
    System.out.println(costumer2);
  }
}
