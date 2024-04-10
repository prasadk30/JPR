package Examples;

public class MultipleConstructorsExample {
    private int value;

    // Constructor with no arguments
    public MultipleConstructorsExample() {
        this.value = 0; // Default value
    }

    // Constructor with one argument
    public MultipleConstructorsExample(int value) {
        this.value = value;
    }

    // Method to get the value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Creating objects of MultipleConstructorsExample class using different constructors
        MultipleConstructorsExample obj1 = new MultipleConstructorsExample();
        MultipleConstructorsExample obj2 = new MultipleConstructorsExample(20);

        // Accessing the values using the getter method
        System.out.println("Value of obj1: " + obj1.getValue()); // Default value (0)
        System.out.println("Value of obj2: " + obj2.getValue()); // Specified value (20)
    }

}
