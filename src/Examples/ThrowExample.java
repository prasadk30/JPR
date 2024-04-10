package Examples;

public class ThrowExample {
    public static void main(String[] args) {
        int age = 17;
        try {
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to validate age
    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be at least 18.");
        }
    }

}
