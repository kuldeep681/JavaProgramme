import java.util.Scanner;
public class JavaAssignment_04 {

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Reverse the string and compare it to the original
        String reversedStr = reverseString(str);
        return str.equalsIgnoreCase(reversedStr); // Compare ignoring case
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Accept a string input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }

        // Close the scanner object
        scanner.close();
    }
}
