import java.util.Scanner;

public class LargestArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Assume first element is the largest
        int largest = arr[0];

        // Find the largest element
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        // Output
        System.out.println("Largest element = " + largest);
    }
}