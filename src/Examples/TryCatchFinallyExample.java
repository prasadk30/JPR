package Examples;

import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt user to enter two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = divide(num1, num2);

            // Display result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle arithmetic exception (e.g., division by zero)
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Close scanner in the finally block to ensure it gets closed even if exception occurs
            scanner.close();
            System.out.println("Scanner closed in the finally block.");
        }

        System.out.println("Program continues after try-catch-finally block.");
    }

    // Method to perform division
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

}
