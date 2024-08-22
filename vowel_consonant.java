import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to count vowels and consonants in a string
    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        input = input.toLowerCase(); // Convert string to lowercase for easy comparison

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            // Check if the character is a consonant (letter and not a vowel)
            else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        // Output the count of vowels and consonants
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the vowels and consonants in the string
        countVowelsAndConsonants(input);

        // Close the scanner
        scanner.close();
    }
