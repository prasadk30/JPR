package Examples;

public class ConstructorExample {
    private int value;

    // Constructor
    public ConstructorExample(int value) {
        this.value = value;
    }

    // Method to get the value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Creating an object of ConstructorExample class using constructor
        ConstructorExample obj = new ConstructorExample(10);

        // Accessing the value using the getter method
        System.out.println("Value: " + obj.getValue());
    }

}
