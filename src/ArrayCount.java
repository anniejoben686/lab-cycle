import java.util.Scanner;

public class ArrayCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Initialize counters
        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Count positive, negative, and zero values
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0)
            {
                positive++;
            } else if (arr[i] < 0)
            {
                negative++;
            } else
            {
                zero++;
            }
        }

        // Display results
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}