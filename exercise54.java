public class Exercise3 {
  public static void main(String args[]) {
    
    int x = Integer.parseInt(args[0]);
      if ( x % 5 == 0 && x % 2 == 0)
    { System.out.println(String.valueOf(x) + " is divisible by 5 and even"); }
      else
    { System.out.println(String.valueOf(x) + " is not divisible by 5 or it is odd"); }
  }
}