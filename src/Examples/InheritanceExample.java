package Examples;


//Parent class
class Vehicle {
 void display() {
     System.out.println("This is a vehicle");
 }
}

//Child class inheriting from Vehicle (Single Inheritance)
class Car extends Vehicle {
 void displayCar() {
     System.out.println("This is a car");
 }
}

//Grandchild class inheriting from Car (Multilevel Inheritance)
class ElectricCar extends Car {
 void displayElectricCar() {
     System.out.println("This is an electric car");
 }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance Example
        Car myCar = new Car();
        myCar.display();    // Output: This is a vehicle
        myCar.displayCar(); // Output: This is a car

        // Multilevel Inheritance Example
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.display();          // Output: This is a vehicle
        myElectricCar.displayCar();       // Output: This is a car
        myElectricCar.displayElectricCar();// Output: This is an electric car
    }

}
