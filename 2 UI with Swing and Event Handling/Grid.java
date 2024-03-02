import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Grid extends JFrame {
	
	JButton b1,b2,b3,b4,b5;

	public Grid() {
		b1 = new JButton("1");
		add(b1);
		b2 = new JButton("2");
		add(b2);
		b3 = new JButton("3");
		add(b3);
		b4 = new JButton("4");
		add(b4);
		b5 = new JButton("5");
		add(b5);
		
		setSize(400,400);
		setVisible(true);
		setLayout(new GridLayout(3,2));
	}
	public static void main(String[] args) {
		new Grid();
	}
}
