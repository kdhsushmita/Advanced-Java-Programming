import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class deleteOperation extends JFrame implements ActionListener {

    JLabel lbluserID;
    JTextField txtuserID;
    JButton btndelete, btnback;

    public deleteOperation() {
        setLayout(new FlowLayout());

        lbluserID = new JLabel("Enter UserID to Delete:");
        add(lbluserID);

        txtuserID = new JTextField(10);
        add(txtuserID);

        btndelete = new JButton("Delete");
        add(btndelete);
        btndelete.addActionListener(this);

        btnback = new JButton("Back");
        add(btnback);
        btnback.addActionListener(this);

        setSize(350, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Delete Operation");
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btndelete) {
            if (txtuserID.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Please enter UserID to delete");
                txtuserID.requestFocus();
            } else {
                try {
                    DBConnection conn = new DBConnection();
                    int userID = Integer.parseInt(txtuserID.getText());
                    String sqlquery = "DELETE FROM userdata WHERE UserID = " + userID;
                    int x = conn.pstmt.executeUpdate(sqlquery);
                    if (x > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Data Deleted Successfully");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "UserID not found");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else if (e.getSource() == btnback) {
            dispose();
            new InsertProgram();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                new deleteOperation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
