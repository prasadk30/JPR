package Examples;

public class WhileLoopExample {

    public static void main(String[] args) {
        // Example 1: Counting from 1 to 5
        System.out.println("Example 1: Counting from 1 to 5");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        
        // Example 2: Summing numbers from 1 to 10
        int sum = 0;
        i = 1;
        System.out.println("\nExample 2: Summing numbers from 1 to 10");
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }

}
