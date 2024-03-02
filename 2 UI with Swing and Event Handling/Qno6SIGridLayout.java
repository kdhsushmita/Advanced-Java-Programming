import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Qno6SIGridLayout extends JFrame implements ActionListener {

    JTextField principalField, rateField, timeField, resultField;
    JButton calculateButton;

    public Qno6SIGridLayout() {
        setTitle("Simple Interest Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 2));

        JLabel principalLabel = new JLabel("Principal:");
        add(principalLabel);
        principalField = new JTextField(10);
        add(principalField);

        JLabel rateLabel = new JLabel("Rate of Interest:");
        add(rateLabel);
        rateField = new JTextField(10);
        add(rateField);

        JLabel timeLabel = new JLabel("Time (in years):");
        add(timeLabel);
        timeField = new JTextField(10);
        add(timeField);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        JLabel resultLabel = new JLabel("Simple Interest:");
        add(resultLabel);
        resultField = new JTextField(10);
        add(resultField);

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
        new Qno6SIGridLayout();
    }
}
