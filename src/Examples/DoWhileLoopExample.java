package Examples;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        // Example 1: Counting from 1 to 5
        System.out.println("Example 1: Counting from 1 to 5");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
        
        // Example 2: Summing numbers from 1 to 10
        int sum = 0;
        i = 1;
        System.out.println("\nExample 2: Summing numbers from 1 to 10");
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("Sum: " + sum);
    }

}
