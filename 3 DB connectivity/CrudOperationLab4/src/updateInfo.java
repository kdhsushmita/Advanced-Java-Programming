import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class updateInfo extends JFrame implements ActionListener {

    JLabel lblUserID, lblNewUsername;
    JTextField txtUserID, txtNewUsername;
    JButton btnUpdate;

    public updateInfo() {
        lblUserID = new JLabel("UserID");
        add(lblUserID).setBounds(20, 20, 100, 20);

        txtUserID = new JTextField();
        add(txtUserID).setBounds(120, 20, 100, 20);

        lblNewUsername = new JLabel("New Username");
        add(lblNewUsername).setBounds(20, 60, 100, 20);

        txtNewUsername = new JTextField();
        add(txtNewUsername).setBounds(120, 60, 100, 20);

        btnUpdate = new JButton("Update");
        add(btnUpdate).setBounds(20, 100, 100, 20);
        btnUpdate.addActionListener(this);

        setSize(300, 180);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Update Information");
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnUpdate) {
            updateData();
        } 
    }

    private void updateData() {
        if (txtUserID.getText().equals("") || txtNewUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "All fields must be filled");
        } else {
            try {
                DBConnection conn = new DBConnection();

                int userID = Integer.parseInt(txtUserID.getText());
                String newUsername = txtNewUsername.getText();

                String sqlQuery = "UPDATE userdata SET username = '" + newUsername + "' WHERE userID = " + userID;
                int x = conn.pstmt.executeUpdate(sqlQuery);

                if (x > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Data Updated Successfully");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Failed to update data");
                }

                
            } catch (Exception e) {
                System.err.println("Error: Unable to update data.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new updateInfo();
    }
}
