public class Exercise4 {
  public static void main(String args[]) {
    
    String x = args[0];
    switch (x) {
    case "yellow": case "red": case "blue": System.out.println(x + " is a primary color"); break;
    default: System.out.println(x + " is not a primary color"); break;
} 
  }
}