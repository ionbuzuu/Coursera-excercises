public class Exercise3 {
  public static void main(String args[]) {
    
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    if (a > b) {
      int c = b;
      b = a;
      a = c;
    }
    
    //add code below this line
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt():
        scanner.close();
        int sum = 0;
        for (int i = Math.min(firstNumber, secondNumber); i <= Math.max(firstNumber, secondNumber); i++) {
            sum += i;
        }
        System.out.println("Consecutive sum: " + sum);


    //add code above this line
  }
}