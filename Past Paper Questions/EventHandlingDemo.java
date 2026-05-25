import javax.swing.*;
import java.awt.event.*;

/**
 * CONCEPT SUMMARY: EVENT HANDLING IN JAVA
 * * Event handling is the mechanism by which a Java GUI application responds to user 
 * actions such as mouse clicks, key presses, and button selections.
 * * KEY OBJECTS INVOLVED:
 * 1. Event Source   — The UI component that generates the event (e.g., JButton, JTextField).
 * 2. Event Object   — Encapsulates information about the event (e.g., ActionEvent, KeyEvent).
 * 3. Event Listener — An interface defining the signature contract to intercept the event (e.g., ActionListener).
 * 4. Event Handler  — The concrete method implementation containing the execution response logic (e.g., actionPerformed()).
 * * EVENT HANDLING RUNTIME FLOW:
 * 1. Register a listener on a source component using an "addXXXListener" method.
 * 2. When a user interacts with the UI, an appropriate event object is instantiated automatically.
 * 3. The registered listener's handler method is invoked, passing the event payload into your logic block.
 */
public class EventHandlingDemo {

    public static void main(String[] args) {
        
        // The Event Source (Component)
        JButton btn = new JButton("Click Me");

        /*
         * APPROACH 1: TRADITIONAL ANONYMOUS INNER CLASS
         * * NOTE: This explicitly instantiates an unnamed class implementing 
         * the ActionListener contract directly inside the argument pool.
         */
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // The Event Handler method body
                System.out.println("Button clicked! (via Anonymous Inner Class)");
            }
        });

        /*
         * APPROACH 2: LAMBDA EXPRESSIONS (Java 8+)
         * * NOTE: Because ActionListener is a Functional Interface (it only has a single 
         * abstract method), you can strip away the boilerplate class structures and write 
         * clean, readable, inline event behaviors.
         */
        btn.addActionListener(e -> System.out.println("Button clicked! (via Lambda Expression)"));
    }
}