import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class InsertProgram extends JFrame implements ActionListener{
//The class represents a GUI application 
//for inserting, updating, and displaying user data.
	JLabel lbluserID, lblusername, lbladdress;
	JTextField txtuserID, txtusername, txtaddress;
	JButton btnsave, btnreset, btnexit, btnshowdata, btndeletedata, 
	btnupdatedata;
//for labels, text fields, and buttons
	public InsertProgram() {
		
		``lbluserID = new JLab`````````````````````````````````````````````````el("UserID");
		add(lbluserID).setBounds(20,20,100,20);
		
		txtuserID = new JTextField();
		add(txtuserID).setBounds(120,20,100,20);
		
		lblusername = new JLabel("UserName");
		add(lblusername).setBounds(20,60,100,20);
		
		txtusername = new JTextField();
		add(txtusername).setBounds(120,60,100,20);
		
		lbladdress = new JLabel("Address");
		add(lbladdress).setBounds(20,100,100,20);
		
		txtaddress = new JTextField();
		add(txtaddress).setBounds(120,100,100,20);
		
		btnsave = new JButton("Save");
		add(btnsave).setBounds(20,140,100,20);
		btnsave.addActionListener(this);
		
		btnreset = new JButton("Reset");
		add(btnreset).setBounds(120,140,100,20);
		btnreset.addActionListener(this);
		
		btnexit = new JButton("Exit");
		add(btnexit).setBounds(220,140,100,20);
		btnexit.addActionListener(this);
		
		btnshowdata = new JButton("Show Data");
		add(btnshowdata).setBounds(20,160,100,20);
		btnshowdata.addActionListener(this);
		
		btndeletedata = new JButton("Delete Data");
		add(btndeletedata).setBounds(120,160,100,20);
		btndeletedata.addActionListener(this);
		
		btnupdatedata = new JButton("Update Data");
		add(btnupdatedata).setBounds(220,160,100,20);
		btnupdatedata.addActionListener(this);
		
		setSize(400,250);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Insert Application");
		setResizable(false);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnsave) {
			if(txtuserID.getText().equals("")
					||txtusername.getText().equals("")
					||txtaddress.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "All FIeld must be filled");
			}
			else {
				try {
					DBConnection conn = new DBConnection();
				
					int userID = Integer.parseInt(txtuserID.getText());
					String username = txtusername.getText();
					String address = txtaddress.getText();
					
					String sqlquery = "insert into userdata values('"+userID+"','"+username+"','"+address+"')";
					int x = conn.pstmt.executeUpdate(sqlquery);
					JOptionPane.showMessageDialog(rootPane, "Data Inserted Successfully");
					
				} catch (Exception e2) {
					System.err.println("Error: Unable to insert into database.");
		            e2.printStackTrace();
				}
			
			}
		}
		if(e.getSource()==btnreset) {
			txtuserID.setText("");
			txtusername.setText("");
			txtaddress.setText("");
			txtuserID.requestFocus();
			
		}
		if(e.getSource()==btnexit) {
			dispose();
		}
		if(e.getSource()==btnshowdata) {
			new alldetails();
			dispose();
//The dispose() method is 
//used to release the resources associated with a window and close it.
		}
		if(e.getSource()==btndeletedata) {
			new deleteOperation();
			dispose();
//The dispose() method is 
//used to release the resources associated with a window and close it.
		}
		if(e.getSource()==btnupdatedata) {
			new updateInfo();
			dispose();
//The dispose() method is 
//used to release the resources associated with a window and close it.
		}
		
	}
	
	public static void main(String[] args) {
		new InsertProgram();
	}

}