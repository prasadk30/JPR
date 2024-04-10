package Examples;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Primitive data types
        int intValue = 10;
        double doubleValue = 20.5;
        char charValue = 'A';
        boolean booleanValue = true;

        // Converting primitives into objects using wrapper classes
        Integer integerObject = Integer.valueOf(intValue); // Converting int to Integer
        Double doubleObject = Double.valueOf(doubleValue); // Converting double to Double
        Character charObject = Character.valueOf(charValue); // Converting char to Character
        Boolean booleanObject = Boolean.valueOf(booleanValue); // Converting boolean to Boolean

        // Displaying converted objects
        System.out.println("Converted Integer object: " + integerObject);
        System.out.println("Converted Double object: " + doubleObject);
        System.out.println("Converted Character object: " + charObject);
        System.out.println("Converted Boolean object: " + booleanObject);

        // Alternatively, you can also use constructor method for conversion
        // Integer integerObject2 = new Integer(intValue);
        // Double doubleObject2 = new Double(doubleValue);
        // Character charObject2 = new Character(charValue);
        // Boolean booleanObject2 = new Boolean(booleanValue);
    }

}
