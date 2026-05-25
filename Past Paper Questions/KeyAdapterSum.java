import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyAdapterSum extends JFrame {

    // Components declared as class fields for global visibility within the instance
    private JTextField tf1 = new JTextField(10);
    private JTextField tf2 = new JTextField(10);
    private JTextField out = new JTextField(10);

    public KeyAdapterSum() {
        setTitle("Sum with KeyAdapter");
        setLayout(new FlowLayout());

        // --- Add UI Components ---
        add(new JLabel("Num 1:")); 
        add(tf1);
        
        add(new JLabel("Num 2:")); 
        add(tf2);
        
        add(new JLabel("Sum  :")); 
        add(out);
        
        out.setEditable(false); // Make output field read-only

        // --- Create KeyAdapter for Dynamic/Real-time Calculation ---
        KeyAdapter ka = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    // Try to parse inputs as integers
                    int a = Integer.parseInt(tf1.getText().trim());
                    int b = Integer.parseInt(tf2.getText().trim());
                    
                    // Display the sum if parsing succeeds
                    out.setText(String.valueOf(a + b));
                } catch (NumberFormatException ex) {
                    // Clear the output field if any input is empty or invalid
                    out.setText("");
                }
            }
        };

        // Attach the same listener instance to both input fields
        tf1.addKeyListener(ka);
        tf2.addKeyListener(ka);

        // --- Window Settings ---
        setSize(300, 150);
        setLocationRelativeTo(null); // Center window on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI construction on the Event Dispatch Thread (EDT) for thread safety
        SwingUtilities.invokeLater(() -> new KeyAdapterSum());
    }
}