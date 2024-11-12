import java.util.Scanner;
public class JavaAssignment_08 {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the inverted triangle
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        // Outer loop for each row
        for (int i = n; i >= 1; i--) {
            // Inner loop to print numbers in each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " "); // Print number followed by space
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
