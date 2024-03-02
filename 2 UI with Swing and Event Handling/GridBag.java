import javax.swing.*;
import java.awt.*;

public class GridBag {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Adding a JLabel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // padding
        frame.add(new JLabel("Username:"), gbc);

        // Adding a JTextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // fill horizontally
        frame.add(new JTextField(15), gbc);

        // Adding a JLabel
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("Password:"), gbc);

        // Adding a JPasswordField
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JPasswordField(15), gbc);

        // Adding a JButton
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER; // center the button
        frame.add(new JButton("Login"), gbc);

        frame.pack();
        frame.setLocationRelativeTo(null); // center the frame
        frame.setVisible(true);
    }
}

