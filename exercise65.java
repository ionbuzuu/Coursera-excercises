import java.util.Scanner;

public class ConsecutiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        scanner.close();

        int sum = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum += i;
        }integers

        if (a == b) {
            System.out.println("Sum: " + a);
        } else {
            System.out.println("Consecutive sum: " + sum);
        }