
import java.util.Scanner;

public class Factorial {
    // Function to compute factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {#3
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        // Compute and display the factorial
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
