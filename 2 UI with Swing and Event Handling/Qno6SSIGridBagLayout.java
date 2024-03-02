import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Qno6SSIGridBagLayout extends JFrame implements ActionListener 
{

    JTextField principalField, rateField, timeField, resultField;
    JButton calculateButton;

    public Qno6SSIGridBagLayout() {
        setTitle("Simple Interest Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Principal:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        principalField = new JTextField(10);
        add(principalField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Rate of Interest:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        rateField = new JTextField(10);
        add(rateField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Time (in years):"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        timeField = new JTextField(10);
        add(timeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(new JLabel("Simple Interest:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField, gbc);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double principal = Double.parseDouble(principalField.getText());
        double rate = Double.parseDouble(rateField.getText());
        double time = Double.parseDouble(timeField.getText());

        double simpleInterest = (principal * rate * time) / 100;

        resultField.setText(String.valueOf(simpleInterest));
    }

    public static void main(String[] args) {
        new Qno6SSIGridBagLayout();
    }
}
