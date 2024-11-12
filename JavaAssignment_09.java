import java.util.Scanner;
public class JavaAssignment_09 {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for Floyd's Triangle
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        // Variable to keep track of the next number to print
        int number = 1;

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");  // Print the number followed by a space
                number++;  // Increment the number for the next position
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner object
        scanner.close();
    }
}
