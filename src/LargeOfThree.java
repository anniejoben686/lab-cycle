import java.util.Scanner;
public class LargeOfThree
{
    static int a,b,c;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a + "is largest");
            }
            else
            {
                System.out.println(c + "is largest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b + "is largest");
            }
            else
            {
                System.out.println(c + "is largest");
            }
        }
    }
}
