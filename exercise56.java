public class Exercise5 {
  public static void main(String args[]) {
    
    String x = args[0];
    switch (x) {
    case "a": case "e": case "i": case "o": case "u": System.out.println(x + " is a vowel"); break;
    default: System.out.println(x + " is not a vowel"); break;
}
  }
}