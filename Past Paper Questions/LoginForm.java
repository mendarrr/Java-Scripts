// CAT I 2023 - Login Form Implementation
import java.awt.*;

public class LoginForm extends Frame {

    public LoginForm() {
        setTitle("Login");
        setLayout(new GridLayout(3, 2, 5, 5));

        // Form Fields
        add(new Label("Name:"));
        TextField tfName = new TextField(15);
        add(tfName);

        add(new Label("Password:"));
        TextField tfPass = new TextField(15);
        tfPass.setEchoChar('*'); // Obscures password input
        add(tfPass);

        // Control Buttons
        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");
        add(submit); 
        add(cancel);

        // Action Listeners
        submit.addActionListener(e -> System.out.println("Login: " + tfName.getText()));
        cancel.addActionListener(e -> System.exit(0));

        // Window Configurations
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}