public class FactorialCalculator {

    // Method to calculate factorial using a loop
    public static int factorialUsingLoop(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 1000; // Example input
        int factorial = factorialUsingLoop(number);
        System.out.println("Factorial of " + number + " using loop is: " + factorial);
    }
}
