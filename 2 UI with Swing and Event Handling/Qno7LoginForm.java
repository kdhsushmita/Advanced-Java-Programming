import java.awt.event.*;
import javax.swing.*;

public class Qno7LoginForm extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public Qno7LoginForm() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);      
        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(this);
        
        add(userLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
       
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        //This line retrieves the characters entered in the passwordField 
        //JPasswordField, converts them to a String, 
        String password = new String(passwordField.getPassword());

        if ("admin".equals(username) && "admin".equals(password)) {
        	//this line displays a dialog box with the message "Access Granted"
            JOptionPane.showMessageDialog(this, "Access Granted");
        } else {
            JOptionPane.showMessageDialog(this, "Access Denied");
        }
    }

    public static void main(String[] args) {
        new Qno7LoginForm();
    }
}
