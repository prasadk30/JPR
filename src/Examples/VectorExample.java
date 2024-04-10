package Examples;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Display the elements of the Vector
        System.out.println("Vector elements: " + vector);

        // Accessing elements using get() method
        System.out.println("First element: " + vector.get(0));
        System.out.println("Second element: " + vector.get(1));
        System.out.println("Third element: " + vector.get(2));

        // Update an element
        vector.set(1, "Grapes");
        System.out.println("Vector after updating: " + vector);

        // Remove an element
        vector.remove(0);
        System.out.println("Vector after removing an element: " + vector);

        // Check if an element exists
        if (vector.contains("Orange")) {
            System.out.println("Vector contains Orange");
        } else {
            System.out.println("Vector does not contain Orange");
        }

        // Get the size of the vector
        System.out.println("Size of the vector: " + vector.size());

        // Iterate through the vector using for-each loop
        System.out.println("Iterating through the vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }

}
