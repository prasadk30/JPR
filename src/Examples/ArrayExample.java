package Examples;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access elements of the array
        System.out.println("Accessing elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Update an element of the array
        numbers[2] = 10;
        System.out.println("\nArray after updating an element:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSum of elements in the array: " + sum);

        // Find the maximum element in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);

        // Declare and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access elements of the 2D array
        System.out.println("\nAccessing elements of the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
