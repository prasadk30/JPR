package Examples;

public class ForLoopExample {
	
	public static void main(String[] args) {
		
		// Example 1: Printing numbers from 1 to 5
		
	    System.out.println("Example 1: Printing numbers from 1 to 5");
	    for (int i = 1; i <= 5; i++) {
	        System.out.println(i);
	    }
	    
	    // Example 2: Summing numbers from 1 to 10
		
		  int sum = 0; System.out.println("\nExample 2: Summing numbers from 1 to 10");
		  for (int i = 1; i <= 10; i++) { sum += i; } System.out.println("Sum: " +
		  sum);
		 
	    // Example 3: Printing even numbers from 2 to 10
		
		  System.out.println("\nExample 3: Printing even numbers from 2 to 10"); for
		  (int i = 2; i <= 10; i += 2) { System.out.println(i); }
		 
	    
	    // Example 4: Iterating over an array
		
		  int[] numbers = {1, 2, 3, 4, 5};
		  System.out.println("\nExample 4: Iterating over an array"); for (int i = 0; i
		  < numbers.length; i++) { System.out.println("Element at index " + i + ": " +
		  numbers[i]); }
		 
	    
	    // Example 5: Nested loop
		
		  System.out.println("\nExample 5: Nested loop"); for (int i = 1; i <= 3; i++)
		  { for (int j = 1; j <= 3; j++) { System.out.println("i = " + i + ", j = " +
		  j); } }
		 

	}
    

}
