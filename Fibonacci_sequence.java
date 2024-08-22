import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the value of n
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        // Generate and print the Fibonacci sequence
        generateFibonacci(n);

        // Close the scanner
        scanner.close();
    }

    // Method to generate and print the first n Fibonacci numbers
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next number in the sequence
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next
