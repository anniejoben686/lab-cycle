import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Rate: ");
        float rate = sc.nextFloat();

        System.out.print("Enter Time: ");
        float time = sc.nextFloat();

        // Calculate Simple Interest
        float simpleInterest = (principal * rate * time) / 100;

        // Calculate Total Amount
        float amount = principal + simpleInterest;

        // Display Output
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Amount = " + amount);

    }
}