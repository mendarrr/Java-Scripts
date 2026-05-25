// Number Addition GUI April 2024 Q4c (10 marks)
import javax.swing.*;
import java.awt.*;

public class NumberAddition extends JFrame {

    // Components declared as class fields for accessibility
    private JTextField first  = new JTextField(10);
    private JTextField second = new JTextField(10);
    private JTextField result = new JTextField(10);

    public NumberAddition() {
        setTitle("Number Addition");
        
        // --- Form Panel Construction ---
        JPanel p = new JPanel(new GridLayout(4, 2, 5, 5));
        p.setBorder(BorderFactory.createTitledBorder("Number Addition"));
        
        p.add(new JLabel("First Number:", JLabel.RIGHT)); 
        p.add(first);
        
        p.add(new JLabel("Second Number:", JLabel.RIGHT)); 
        p.add(second);
        
        p.add(new JLabel("Result:", JLabel.RIGHT)); 
        p.add(result);
        
        result.setEditable(false); // Read-only field

        // --- Buttons & Event Listeners ---
        JButton add   = new JButton("Add");
        JButton clear = new JButton("Clear");
        JButton exit  = new JButton("Exit");

        // Logic for adding inputs
        add.addActionListener(e -> {
            try {
                double a = Double.parseDouble(first.getText());
                double b = Double.parseDouble(second.getText());
                result.setText(String.valueOf(a + b));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Logic for clearing fields
        clear.addActionListener(e -> {
            first.setText(""); 
            second.setText(""); 
            result.setText("");
        });

        // Logic for terminating application
        exit.addActionListener(e -> System.exit(0));

        // --- Layout Placement ---
        JPanel btnPanel = new JPanel();
        btnPanel.add(add); 
        btnPanel.add(clear);

        add(p, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        add(exit, BorderLayout.EAST);

        // --- Window Settings ---
        setSize(450, 220);
        setLocationRelativeTo(null); // Centers window on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI construction on the Event Dispatch Thread (EDT) for thread-safety
        SwingUtilities.invokeLater(() -> new NumberAddition());
    }
}