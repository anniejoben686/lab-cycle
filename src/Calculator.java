import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display Menu
        System.out.println("Operations");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Input choice
        System.out.print("Select your choice: ");
        int choice = sc.nextInt();

        // Input numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0)
                {
                    System.out.println("Result = " + (a / b));
                } else
                {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}