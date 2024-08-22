import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        // Compare characters from the start and end moving towards the center
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
