package Examples;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0); // Division by zero will throw an ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed if an exception occurs
        } catch (ArithmeticException e) {
            // Catching and handling the ArithmeticException
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
            // This block will always execute, regardless of whether an exception occurred or not
            System.out.println("Inside finally block");
        }
        
        // Code execution continues here after handling the exception
        System.out.println("Program continues after exception handling");
    }

    // A method that may throw an exception
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

}
