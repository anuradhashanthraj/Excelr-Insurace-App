import java.util.Scanner;

public class AdditionUsingScanner {

    // Method to perform addition of two numbers
    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Call the addNumbers method to calculate the sum
        double sum = addNumbers(num1, num2);

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
