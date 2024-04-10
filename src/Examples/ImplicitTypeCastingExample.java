package Examples;

public class ImplicitTypeCastingExample {
    public static void main(String[] args) {
        // Implicit type casting from int to double
        int intValue = 10;
        double doubleValue = intValue; // int is implicitly cast to double
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        
        // Implicit type casting from float to double
        float floatValue = 20.5f;
        double doubleValue2 = floatValue; // float is implicitly cast to double
        System.out.println("\nfloat value: " + floatValue);
        System.out.println("double value: " + doubleValue2);
        
        // Implicit type casting from long to float
        long longValue = 100L;
        float floatValue2 = longValue; // long is implicitly cast to float
        System.out.println("\nlong value: " + longValue);
        System.out.println("float value: " + floatValue2);
        
        // Implicit type casting from char to int
        char charValue = 'A';
        int intValue2 = charValue; // char is implicitly cast to int
        System.out.println("\nchar value: " + charValue);
        System.out.println("int value: " + intValue2);
    }

}
