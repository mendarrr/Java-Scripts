// A constructor is a special method in a class that has the exact same name as the class and has no explicit return type (not even void). It is automatically invoked when an instance (object) of the class is created using the new keyword. Its primary purpose is to initialize the object's attributes to valid initial values and allocate memory for the object.
// An anonymous object is an object that is created without assigning it to a reference variable. It is ideal for one-time use cases, such as passing a data payload directly into a method argument pool.
// A multi-argument (parameterized) constructor accepts parameters when instantiated, allowing custom state data configurations during an object's initialization sequence.

// ============================================================================
// CONCEPT 1: ANONYMOUS OBJECTS AND PARAMETERIZED CONSTRUCTORS
// ============================================================================

class Student {
    String name;

    /**
     * SINGLE-ARGUMENT CONSTRUCTOR
     * * NOTE: This constructor initializes the 'name' field of a newly created 
     * Student instance. The 'this' keyword resolves the naming conflict 
     * between the local parameter 'name' and the instance variable 'this.name'.
     */
    Student(String name) {
        this.name = name;
    }
}

class Printer {
    /**
     * METHOD ACCEPTING AN OBJECT REFERENCE
     * * NOTE: This method accepts a parameter of type 'Student'. It doesn't care 
     * whether the passed object has a permanent reference name or is anonymous.
     */
    void print(Student s) {
        System.out.println("Printer Output - Student Name: " + s.name);
    }
}

class Book {
    String title;
    String author;
    double price;

    /**
     * MULTI-ARGUMENT CONSTRUCTOR
     * * NOTE: Used when an object requires multiple structural data dependencies 
     * at birth. This ensures that a 'Book' object can never be instantiated 
     * in an incomplete state without a title, author, or price.
     */
    Book(String title, String author, double price) {
        this.title  = title;
        this.author = author;
        this.price  = price;
    }

    void display() {
        System.out.println(title + " by " + author + " @ KES " + price);
    }
}

// ============================================================================
// ENGINE EXECUTION (DEMONSTRATING INSTANTIATION TYPES)
// ============================================================================
public class ConstructorDemo {
    public static void main(String[] args) {
        
        Printer printer = new Printer();

        /*
         * NOTE ON ANONYMOUS OBJECTS:
         * 'new Student("Alice")' creates a valid object on the system Heap memory, 
         * but does NOT store it inside a named reference variable (like Student s = ...).
         * * It is passed directly as a temporary argument to the 'print' method. 
         * Once the 'print' method completes execution, this anonymous object becomes 
         * unreachable and eligible for automatic Java Garbage Collection.
         */
        printer.print(new Student("Alice")); 

        
        /*
         * NOTE ON MULTI-ARGUMENT INSTANTIATION:
         * Unlike the anonymous object above, 'myBook' is a NAMED REFERENCE variable.
         * The constructor matches the signatures sequentially: 
         * String -> String -> double.
         */
        Book myBook = new Book("Java Basics", "James Gosling", 1500.0);
        myBook.display();
    }
}