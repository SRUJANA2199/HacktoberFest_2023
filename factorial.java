import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate and display the factorial
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }

    // Function to calculate factorial
    private static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Factorial is not defined for negative numbers
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
