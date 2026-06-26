import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // variable to store the sum of digits
        int sum = 0;

        // Find sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        // Output
        System.out.println("Sum of digits = " + sum);

    }
}