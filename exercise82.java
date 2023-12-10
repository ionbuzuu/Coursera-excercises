public class ArrayAlgorithms {
  public static void main(String args[]) {
    String[] cars = {"Corrola", "Camry", "Prius", "RAV4", "Highlander"};
    String Camry = "A Camry is not available.";

    for (String s : cars) {
      if (s.equals("Camry")) {
        Camry = "A Camry is available."; 
    
      }
    
    }
      System.out.println(Camry); 
  }
}