package Examples;

//Parent class
class Animal {
 // Method to make sound
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class inheriting from Animal
class Dog extends Animal {
 // Overriding the makeSound method of the parent class
 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }
}

//Child class inheriting from Animal
class Cat extends Animal {
 // Overriding the makeSound method of the parent class
 @Override
 public void makeSound() {
     System.out.println("Cat meows");
 }
}

public class OverrideExample {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling makeSound method of each object
        animal.makeSound(); // Output: Animal makes a sound
        dog.makeSound(); // Output: Dog barks
        cat.makeSound(); // Output: Cat meows
    }

}
