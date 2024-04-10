package Examples;

public class WrapperClassToObjectExample {
    public static void main(String[] args) {
        // Wrapper class objects
        Integer integerObject = Integer.valueOf(100); // Integer object
        Double doubleObject = Double.valueOf(20.5); // Double object
        Character charObject = Character.valueOf('A'); // Character object
        Boolean booleanObject = Boolean.valueOf(true); // Boolean object

        // Converting wrapper class objects into primitives
        int intValue = integerObject.intValue(); // Converting Integer to int
        double doubleValue = doubleObject.doubleValue(); // Converting Double to double
        char charValue = charObject.charValue(); // Converting Character to char
        boolean booleanValue = booleanObject.booleanValue(); // Converting Boolean to boolean

        // Displaying converted primitive values
        System.out.println("Converted int value: " + intValue);
        System.out.println("Converted double value: " + doubleValue);
        System.out.println("Converted char value: " + charValue);
        System.out.println("Converted boolean value: " + booleanValue);

        // Alternatively, you can also use auto-unboxing for conversion
        // int intValue2 = integerObject; // Auto-unboxing Integer to int
        // double doubleValue2 = doubleObject; // Auto-unboxing Double to double
        // char charValue2 = charObject; // Auto-unboxing Character to char
        // boolean booleanValue2 = booleanObject; // Auto-unboxing Boolean to boolean
    }

}
