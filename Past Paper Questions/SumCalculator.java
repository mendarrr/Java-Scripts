import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * NOTE ON INTERFACE IMPLEMENTATION (ActionListener):
 * This class uses the traditional approach of implementing the ActionListener 
 * interface directly in the class signature. This requires the class to override 
 * the actionPerformed() method, which acts as the centralized event handler.
 */
public class SumCalculator extends JFrame implements ActionListener {

    // Class fields for UI components to ensure visibility inside the event method
    private JTextField field1 = new JTextField(10);
    private JTextField field2 = new JTextField(10);
    private JLabel     result = new JLabel("Result will appear here");
    private JButton    btn    = new JButton("Calculate Sum");

    public SumCalculator() {
        setTitle("Sum Calculator");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // --- Add UI Elements to Layout Content Pane ---
        add(new JLabel("Number 1:"));  
        add(field1);

        add(new JLabel("Number 2:"));  
        add(field2);

        add(btn);
        add(result);

        /*
         * NOTE ON EVENT REGISTRATION:
         * 'this' refers to the current instance of SumCalculator. Since SumCalculator
         * IS an ActionListener (via implementation), we pass it directly to register 
         * the button's action trigger.
         */
        btn.addActionListener(this);

        // --- Window Settings ---
        setSize(300, 200);
        setLocationRelativeTo(null); // Centers the frame on the screen
        setVisible(true);
    }

    /**
     * CENTRALIZED EVENT HANDLER
     * This method automatically executes whenever an action event occurs on a 
     * component registered with 'this' listener (the calculate button).
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * NOTE ON EXCEPTION PROTECTION:
         * Double.parseDouble() can throw a NumberFormatException if a text field 
         * contains letters, symbols, or is empty. Wrapping the extraction in a 
         * try-catch prevents application thread crashing.
         */
        try {
            double n1  = Double.parseDouble(field1.getText().trim());
            double n2  = Double.parseDouble(field2.getText().trim());
            double sum = n1 + n2;
            
            result.setText("Sum = " + sum);
        } 
        catch (NumberFormatException ex) {
            result.setText("Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        // Run the GUI creation on the safe Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new SumCalculator());
    }
}