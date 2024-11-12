import java.util.Scanner;
public class JavaAssignment_06 {

    // Method to find the second largest number in an array
    public static int findSecondLargest(int[] arr) {
        // Edge case: if there are less than two elements, there's no second largest number
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse through the array to find the largest and second largest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // Update second largest
            }
        }

        // If the second largest is still Integer.MIN_VALUE, it means there was no valid second largest
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest number found.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Accept n from the user, the number of integers to input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the n integers
        int[] arr = new int[n];

        // Accept the n integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the method to find and display the second largest number
        try {
            int secondLargest = findSecondLargest(arr);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner object
        scanner.close();
    }
}

    
