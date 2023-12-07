import java.util.ArrayList;

public class ArrayListAddRemove {
  public static void main(String args[]) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(50);
    numbers.add(100);
    System.out.println(numbers);

    numbers.add(0, 12);
    System.out.println(numbers);
      }
}