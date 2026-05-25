/**
 * CONCEPT SUMMARY: JAVA INTERFACES
 * * * What is an Interface?
 * An interface is a formal contract that defines a set of behaviors (signatures) 
 * without dictating the actual implementation details. Classes implement interfaces 
 * to promise they will fulfill these structural behaviors.
 * * * Key Architectural Properties:
 * 1. Multiple Inheritance: Unlike abstract classes, a Java class can implement 
 * multiple interfaces simultaneously (e.g., class Square implements Drawable, Resizable).
 * 2. Implicit Modifiers: Abstract methods declared inside an interface are implicitly 
 * 'public' and 'abstract'. You do not need to explicitly type those keywords.
 * 3. Default Methods (Java 8+): Allow interfaces to provide a fallback, concrete implementation 
 * using the 'default' keyword. This allows API modification without breaking legacy implementations.
 * 4. Static Methods (Java 8+): Belong directly to the interface template space. They cannot 
 * be overridden by implementing classes and are invoked directly using 'InterfaceName.method()'.
 */

// ============================================================================
// INTERFACE DEFINITIONS
// ============================================================================

interface Drawable {
    // Abstract method: Implicitly public and abstract (no method body)
    void draw();

    // Default method: Provides a concrete, optional implementation body
    default void describe() {
        System.out.println("I am drawable.");
    }

    // Static method: Acts as a utility helper bound to the Interface namespace
    static int version() {
        return 1;
    }
}

interface Resizable {
    void resize(double factor);
}

// ============================================================================
// INTERFACE IMPLEMENTATIONS
// ============================================================================

/**
 * SINGLE INTERFACE IMPLEMENTATION
 * * Circle is structurally bound to fulfill the 'Drawable' behavior pattern.
 */
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

/**
 * MULTIPLE INTERFACE IMPLEMENTATION
 * * Java allows comma-separated multi-interface consumption. This bypasses 
 * the strict single-inheritance limitation of 'extends'.
 */
class Square implements Drawable, Resizable {
    
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Resizing by factor: " + factor);
    }
}

// ============================================================================
// EXECUTION DEMONSTRATION
// ============================================================================
public class InterfaceDemo {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Testing Circle ===");
        Circle c = new Circle();
        c.draw();
        c.describe(); // Automatically inherits default behavior from Drawable

        System.out.println("\n=== 2. Testing Square ===");
        Square s = new Square();
        s.draw();
        s.resize(2.5);
        s.describe(); // Automatically inherits default behavior from Drawable

        System.out.println("\n=== 3. Static Interface Access ===");
        // Static methods are invoked directly on the Interface name itself
        int currentVersion = Drawable.version();
        System.out.println("Drawable Interface Version: " + currentVersion);
    }
}