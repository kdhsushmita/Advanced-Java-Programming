import java.awt.event.*;
import javax.swing.*;

class Qno2mult2nos extends JFrame implements 
ActionListener {
    JLabel l1, l2;
    JTextField t1, t2, t3;
    JButton b1;

    public Qno2mult2nos() {
        l1 = new JLabel("First Number");
        l1.setBounds(20, 10, 100, 20);
        t1 = new JTextField(10);
        t1.setBounds(120, 10, 100, 20);

        l2 = new JLabel("Second Number");
        l2.setBounds(20, 40, 100, 20);
        t2 = new JTextField(10);
        t2.setBounds(120, 40, 100, 20);

        b1 = new JButton("Multiply");
        b1.setBounds(20, 70, 80, 20);
        add(b1);
        t3 = new JTextField(10);
        t3.setBounds(120, 70, 100, 120);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(t3);

        b1.addActionListener(this);

        setTitle("Multiply Two Numbers");
        setSize(250,250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int product = num1 * num2;
            t3.setText(String.valueOf(product));
        }
    }

    public static void main(String args[]) {
        new Qno2mult2nos();
    }
}
