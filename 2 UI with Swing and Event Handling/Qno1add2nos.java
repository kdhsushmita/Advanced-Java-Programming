import java.awt.event.*; 
//imports necessary packages for event handling (ActionEvent, MouseListener).
import javax.swing.*;
//This code imports necessary packages for GUI components
//(JFrame, JLabel, JTextField, JButton, etc.)

public class Qno1add2nos extends JFrame 
//extends JFrame (a class for creating GUI windows)
implements MouseListener{
	//By implementing the MouseListener interface, the class Qno1add2nos commits to
	//providing an implementation for the actionPerformed method,
	//Declares several GUI components such as labels 
	//(l1, l2, l3), text fields (t1, t2, t3), and a button (b1)
	JLabel l1,l2; //JLabel components,
	JTextField t1,t2,t3; //JTextField components,
	JButton b1; //JButton component.
	
	public Qno1add2nos() {
		l1=new JLabel("First Numbers");
		l1.setBounds(20,10,100,20);
		t1=new JTextField(10); 
		//text fields for user input and displaying the result.
		t1.setBounds(120,10,100,20);
		//setBounds is used to set the position (x, y)
		//and size (width, height) of each label and text field.
		l2=new JLabel("Second Number");
		l2.setBounds(20,40,100,20);
		t2=new JTextField(10);
		t2.setBounds(120,40,100,20);

		b1 = new JButton("Sum");
		b1.setBounds(20,70,80,20);
		add(b1);
		t3=new JTextField(10);
		t3.setBounds(120,70,100,120);
		
		add(l1); add(t1); add(l2); add(t2); 
		add(t3);
		
		
		
		b1.addMouseListener(this);
		//when the button is clicked, 
		//the actionPerformed method in this class will be invoked.
		
		setTitle("Add Two Numbers");
		setSize(250,250); //sets the size of the frame.
		setLayout(null); //sets the layout manager to null
		setVisible(true); //makes the frame visible.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	//Implements the actionPerformed method from the MouseListener interface.
	//This method is called when an action (like a button click) occurs.
	//The MouseListener interface has one method:
	//void actionPerformed(ActionEvent e).
	//This method is called when an action event occurs, 
	//such as a button click.
	@Override
	//This annotation indicates that the method is intended 
	//to override a method from a superclass or interface.
	public void mousePressed(MouseEvent e) {
		//checks if the source of the action event (e) is the button b1.
		if(e.getSource()==b1) {
			int num1=Integer.parseInt(t1.getText());
//t1.getText(): Retrieves the text entered in the JTextField t1
			//Integer.parseInt(...): Converts the retrieved text 
			//(assumed to be a numerical value) into an integer.
			int num2=Integer.parseInt(t2.getText());
			int sum=num1+num2;
			t3.setText(String.valueOf(sum));
			//Converts the sum to a string using String.valueOf(...) and 
			//sets this string as the text of the JTextField t3
		}	
	}
 public static void main(String[] args) {
	 new Qno1add2nos();
 }

}
