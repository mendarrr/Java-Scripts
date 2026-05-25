// April 2023 Q5e
// An abstract method is a method declared without a body using the abstract keyword. It defines a contract that all non-abstract subclasses must fulfil by providing their own implementation. 
public class AbstractClass {
    abstract class Payment {
    
    // Abstract method: Has no body; subclasses must provide implementation
    abstract void processPayment(double amount);

    // Concrete method: Has a body and is inherited directly by subclasses
    void receipt() {
        System.out.println("Payment processed.");
    }
}

    // Subclass 1: MpesaPayment handles mobile money processing
    class MpesaPayment extends Payment {
        
        @Override
        void processPayment(double amount) {
            System.out.println("M-Pesa: KES " + amount + " sent.");
        }
}

    // Subclass 2: CardPayment handles banking card processing
    class CardPayment extends Payment {
        
        @Override
        void processPayment(double amount) {
            System.out.println("Card charged: KES " + amount);
        }
}
}
