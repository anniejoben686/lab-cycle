import java.util.Scanner;
public class SortArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter te limit: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        //enter the elements
        System.out.println("Enter the elements: ");

        //read array elements
        for(int i =0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }

        //Sorting the array
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(a[i] < a[j])
                {
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }

        //Displaying the sorted array
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " " );
        }
    }
}
