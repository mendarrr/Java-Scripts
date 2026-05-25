/**
 * Exception handling allows a program to respond to runtime errors gracefully without crashing.
 * * Keyword Table / Purpose Reference:
 * - try: Encloses code that might throw an exception
 * - catch: Catches a specific exception and handles it
 * - finally: Always executes whether or not an exception occurred; used for cleanup
 * - throw: Manually throws an exception object
 * - throws: Declares that a method may throw an exception (in the method signature)
 */
public class ExceptionDemo {

    /**
     * Declares that this method may throw an IllegalArgumentException
     */
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            // Manually throws an exception object if condition is met
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            // Encloses code that might throw an exception
            checkAge(-5);
        } 
        catch (IllegalArgumentException e) {
            // Catches a specific exception and handles it safely
            System.out.println("Caught: " + e.getMessage());
        } 
        finally {
            // Always executes whether or not an exception occurred; used for cleanup
            System.out.println("Done.");
        }
    }
}