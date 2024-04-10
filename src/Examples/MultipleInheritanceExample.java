package Examples;

//Java doesn't support multiple inheritances directly. However, you can achieve similar functionality using interfaces. 
//Here's an example demonstrating multiple inheritance using interfaces:
	// Interface for the first parent class
	interface Parent1 {
	    void method1();
	}

	// Interface for the second parent class
	interface Parent2 {
	    void method2();
	}

	// Child class implementing both Parent1 and Parent2 interfaces (Multiple Inheritance)
	class Child implements Parent1, Parent2 {
	    @Override
	    public void method1() {
	        System.out.println("Method 1 from Parent1");
	    }

	    @Override
	    public void method2() {
	        System.out.println("Method 2 from Parent2");
	    }

	    void display() {
	        System.out.println("Display method of Child class");
	    }
	}


public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1(); // Output: Method 1 from Parent1
        child.method2(); // Output: Method 2 from Parent2
        child.display(); // Output: Display method of Child class
    }

}
