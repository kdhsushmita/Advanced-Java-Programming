import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotePadRead extends JFrame {

    private JTextArea textArea;
    private JFileChooser fileChooser;

    public NotePadRead() {
        setTitle("Simple Notepad App");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");
        JButton exitButton = new JButton("Exit");

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(newButton);
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(exitButton);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        fileChooser = new JFileChooser();
    }

    private void newFile() {
        textArea.setText("");
    }

    private void openFile() {
        int returnVal = fileChooser.showOpenDialog(this);
// Opens a dialog for the user to choose a location and enter a 
//filename for saving a file. 
        if (returnVal == JFileChooser.APPROVE_OPTION) {
// Checks if the user selected a file by clicking "Save" in the dialog.
            File file = fileChooser.getSelectedFile();
//Retrieves the File object representing the file selected by the user.
            try (BufferedReader reader = new BufferedReader
            		(new FileReader(file))) {
// Opens a BufferedWriter for writing characters to the selected file.      		
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                textArea.setText(content.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
    	// Show a dialog for saving a file and store the user's choice
        int returnVal = fileChooser.showSaveDialog(this);

// Check if the user selected a file (clicked "Save" or equivalent)
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        	// Get the selected file from the file chooser
            File file = fileChooser.getSelectedFile();
            try (
//Create a BufferedWriter to efficiently write characters to the file
            		BufferedWriter writer = new BufferedWriter
            		(new FileWriter(file))) {
            	//Write the content of the text area to the selected file
                writer.write(textArea.getText());
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving file",
                		"Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
    	// Swing components are created and modified
        SwingUtilities.invokeLater(() -> {
            new NotePadRead().setVisible(true);
        });
    }
}