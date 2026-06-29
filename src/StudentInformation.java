import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Percentage: ");
        float percentage = sc.nextFloat();

        // Output
        System.out.println("\nStudent Details");
        System.out.println("----------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);
    }
}