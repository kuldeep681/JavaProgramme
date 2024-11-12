import java.util.Scanner;

public class JavaAssignment_07 {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the pyramid
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print number followed by space
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
