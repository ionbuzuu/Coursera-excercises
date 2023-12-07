import java.util.ArrayList;

public class ArrayListGetSet {
  public static void main(String args[]) {
    ArrayList<String> contact = new ArrayList<String>();
    contact.add("First name");
    contact.add("Last name");
    contact.add("Phone number");
    System.out.println(contact);

    contact.set(2, "Email");
    System.out.println(contact);
  }
}