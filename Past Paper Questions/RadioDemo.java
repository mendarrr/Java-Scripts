// CAT I 2023 - Radio Button Demo Implementation
import java.awt.*;

public class RadioDemo extends Frame {

    public RadioDemo() {
        setLayout(new FlowLayout());

        // CheckboxGroup ensures only one option can be selected at a time
        CheckboxGroup cg = new CheckboxGroup();
        
        add(new Checkbox("Male",   cg, true));  // Default selected
        add(new Checkbox("Female", cg, false));

        // Window Configurations
        setSize(200, 100); 
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioDemo();
    }
}