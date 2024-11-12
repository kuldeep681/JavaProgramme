import java.util.Scanner;

public class JavaAssignment_02 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle special cases for numbers less than or equal to 1
        if (num <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }
        return true; // num is prime
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Array to store 10 integers
        int[] numbers = new int[10];

        // Take 10 integers as input from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the prime numbers from the array
        System.out.println("Prime numbers in the array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
