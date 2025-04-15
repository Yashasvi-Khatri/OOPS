import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Increasing salary by 20%
        double increasedSalary = salary + (salary * 0.20);

        // Printing the details
        System.out.println("\nEmployee Details After Salary Increment:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Updated Salary: " + increasedSalary);

        // Closing the scanner
        scanner.close();
    }
}
