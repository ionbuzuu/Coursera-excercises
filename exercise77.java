import java.util.ArrayList;

public class ArrayListArray {
  public static void main(String args[]) {
    String[] top = {"First: ", "Second: ", "Third: ", "Fourth: ", "Fifth: "};
    ArrayList<String> names = new ArrayList<String>();
    names.add("Carol");
    names.add("Bob");
    names.add("Alan");
    names.add("David");
    names.add("Ellen");

    for (int i = 0; i < 5; i++) {
      System.out.println(top[i] + names.get(i));
    }
  }
}