// Create a Vehicle class with a method move() that prints "The vehicle is moving."
public class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

// 1. Create a Car subclass that extends Vehicle and overrides the move() method to print "The car is driving on the road."
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }
}

// 2. Create a Bicycle subclass that extends Vehicle and overrides the move() method to print "The bicycle is pedaling on the road."
class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("The bicycle is pedaling on the road.");
    }
}

// 3. Create a Boat subclass that extends Vehicle and overrides the move() method to print "The boat is sailing on water."
class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("The boat is sailing on water.");
    }
}

// Create the main Driver Class
class VehicleSimulation {
    public static void main(String[] args) {

    // Create an array of Vehicle Objects
    Vehicle[] vehicles = new Vehicle[3];

    // Store the sublass instances in the Vehicle Array
    vehicles[0] = new Car();
    vehicles[1] = new Bicycle();
    vehicles[2] = new Boat();

    // Loop through and call move()
    for (Vehicle vehicle : vehicles) {
        vehicle.move();
    }

    }
}