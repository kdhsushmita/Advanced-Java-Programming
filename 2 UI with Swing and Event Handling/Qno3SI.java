import java.awt.event.*;
import javax.swing.*;

class Qno3SI extends JFrame implements ActionListener {
    JLabel principalLabel, rateLabel, timeLabel;
    JTextField principalField, rateField, timeField, resultField;
    JButton calculateButton;

    public Qno3SI() {
        principalLabel = new JLabel("Principal Amount");
        principalLabel.setBounds(20, 10, 120, 20);
        principalField = new JTextField(10);
        principalField.setBounds(120, 10, 100, 20);

        rateLabel = new JLabel("Rate of Interest");
        rateLabel.setBounds(20, 40, 120, 20);
        rateField = new JTextField(10);
        rateField.setBounds(120, 40, 100, 20);

        timeLabel = new JLabel("Time");
        timeLabel.setBounds(20, 70, 80, 20);
        timeField = new JTextField(10);
        timeField.setBounds(120, 70, 100, 20);
  
        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(20, 100, 80, 20);
        resultField = new JTextField(10);
        resultField.setBounds(120, 100, 100, 120);   
       
        calculateButton.addActionListener(this);

        add(principalLabel);
        add(principalField);
        add(rateLabel);
        add(rateField);
        add(timeLabel);
        add(timeField);
        add(resultField);
        add(calculateButton);

        setSize(350, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());

            double simpleInterest = (principal * rate * time) / 100;

            resultField.setText(String.valueOf(simpleInterest));
        }
    }

    public static void main(String[] args) {
        new Qno3SI();
    }
}
