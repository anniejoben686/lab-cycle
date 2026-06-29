import java.util.Scanner;

public class EmployeeSalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Basic Salary: ");
        float basicSalary = sc.nextFloat();

        // Calculate DA and HRA
        float da = (10 * basicSalary) / 100;
        float hra = (15 * basicSalary) / 100;

        // Calculate Gross Salary
        float grossSalary = basicSalary + da + hra;

        // Display Output
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);
    }
}