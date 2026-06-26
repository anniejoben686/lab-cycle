import java.util.Scanner;
public class SearchArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        //get array elements
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++ )
        {
            a[i] = sc.nextInt();
        }

        //get number to search
        System.out.println("Enter number to search: ");
        int num = sc.nextInt();

        boolean found = false;

        //Search for number
        for (int i = 0; i < n; i++)
        {
                    if (a[i] == num)
                    {
                        System.out.println("Element found at position " + (i + 1));
                        found = true;
                        break;
                    }
        }
        if (!found)
        {
            System.out.println("Element not found");
        }
    }
}
