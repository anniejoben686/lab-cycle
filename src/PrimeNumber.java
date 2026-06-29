import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Numbers less than 2 are not prime
        if (number < 2)
        {
            isPrime = false;
        } else
        {
            // Check for factors from 2 to number/2
            for (int i = 2; i <= number / 2; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        // Display result
        if (isPrime)
        {
            System.out.println(number + " is Prime");
        } else
        {
            System.out.println(number + " is Not Prime");
        }
    }
}