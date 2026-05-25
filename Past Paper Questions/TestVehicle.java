//Inheritance in Java .. April 2024 Q3b
// Vehicle class Implementation
class Vehicle {
    private String make;
    private String registration;

    // Constructor
    public Vehicle(String registration, String make) {
        this.registration = registration;
        this.make         = make;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\nRegistration: " + registration;
    }
}

// Car Class Implementation (Subclass of Vehicle)
class Car extends Vehicle {
    private int seats;

    // Constructor
    public Car(String registration, String make, int seats) {
        super(registration, make); // Call parent (Vehicle) constructor
        this.seats = seats;
    }

    @Override
    public String toString() {
        // Reuse parent's toString implementation and append sub-class details
        return super.toString() + "\nPassengers: " + seats;
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        // Instantiate a generic Vehicle object
        Vehicle v = new Vehicle("KGY 455Y", "Toyota Hilux");
        System.out.println(v.toString());
        
        System.out.println("---");
        
        // Instantiate a specific Car object (Subclass)
        Car c = new Car("KPC 533G", "Subaru Impreza", 5);
        System.out.println(c.toString());
    }
}