import java.util.Scanner;

public class JavaAssignment_03 {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        double num1 = 0, num2 = 0, result = 0;

        do {
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            // Get user input for choice
            choice = scanner.nextInt();

            // If choice is 1, 2, 3, or 4, we prompt for numbers
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            }

            // Check the operation chosen using if-else statements
            if (choice == 1) { // Addition
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            } else if (choice == 2) { // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            } else if (choice == 3) { // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
            } else if (choice == 4) { // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please select a valid option.");
            }

        } while (choice != 5); // Continue until the user chooses to exit
        
        // Exit message
        System.out.println("Exiting the calculator. Goodbye!");
        
        // Close the scanner object
        scanner.close();
    }
}
