import java.util.Scanner;
public class JavaAssignment_05 {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms in the Fibonacci sequence
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Initialize an array to store the first n Fibonacci numbers
        int[] fibonacci = new int[n];

        // Handle the base cases for Fibonacci sequence
        if (n >= 1) {
            fibonacci[0] = 0; // First term is 0
        }
        if (n >= 2) {
            fibonacci[1] = 1; // Second term is 1
        }

        // Fill in the rest of the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the Fibonacci sequence
        System.out.println("First " + n + " terms of the Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        // Close the scanner object
        scanner.close();
    }
}
