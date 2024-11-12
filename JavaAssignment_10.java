import java.util.Scanner;
public class JavaAssignment_10 {

    // Method to count occurrences of a character in the string
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;

        // Loop through each character in the string and check for matches
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;  // Increment count if the character matches
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Accept string input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Accept the character to search for
        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0); // Get the first character input

        // Call the method to count the occurrences of the character in the string
        int count = countCharacterOccurrences(inputString, searchChar);

        // Display the count to the user
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");

        // Close the scanner object
        scanner.close();
    }
}
