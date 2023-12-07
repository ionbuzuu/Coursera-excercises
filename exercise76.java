import java.util.ArrayList;

public class ArrayListIterate {
  public static void main(String args[]) {
    ArrayList<Integer> grades = new ArrayList<Integer>();
    grades.add(85);
    grades.add(95);
    grades.add(48);
    grades.add(100);
    grades.add(92);

    for (Integer i : grades) {
      System.out.println(i);
    }
  }
}