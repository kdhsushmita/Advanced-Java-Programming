import java.awt.*;

import javax.swing.*;

public class Qno5BorderLayout extends JFrame {
	
	JButton btn1, btn2, btn3, btn4,btn5;
	
	public Qno5BorderLayout() {
		btn1 = new JButton("Button1");
		//Adds btn1 to the JFrame using add(component, BorderLayout.NORTH), 
		//placing it in the North region of the BorderLayout.
		add(btn1,BorderLayout.NORTH);

		btn2 = new JButton("Button2");
		add(btn2,BorderLayout.EAST);

		btn3 = new JButton("Button3");
		add(btn3,BorderLayout.WEST);

		btn4 = new JButton("Button4");
		add(btn4,BorderLayout.SOUTH);

		btn5 = new JButton("Button5");
		add(btn5,BorderLayout.CENTER);
		
		setTitle("BorderLayout");
		setSize(500,500);
		setVisible(true);
		setLayout(new BorderLayout());
//Sets the layout manager of the JFrame to BorderLayout.
//The BorderLayout is a layout manager that divides the container into
//five regions: North, South, East, West, and Center. 
//Components added to the JFrame will be placed in one of these regions.
		
	}
	public static void main(String[] args) {
//When an instance is created, the constructor of Qno5BorderLayout is called
		Qno5BorderLayout bld =  new Qno5BorderLayout();
	}
}
