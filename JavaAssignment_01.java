import java.util.Scanner;

public class JavaAssignment_01 {

    // Method to calculate factorial of a number
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate sum of digits of a number
    public static int sumOfDigits(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);

        // Calculate sum of digits of the factorial
        int digitSum = sumOfDigits(factorialResult);
        System.out.println("Sum of digits of " + factorialResult + " is: " + digitSum);

        // Close the scanner object
        scanner.close();
    }
}
