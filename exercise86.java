public class ArrayAlgorithms {
  public static void main(String args[]) {
    int[] numbers = {15, 48, 22, 93, 75};

for (int i : numbers) {
  if (i % 2 == 0) {
    System.out.println("Even");
  }
  else {
    System.out.println("Odd");
  }
}

  }
}