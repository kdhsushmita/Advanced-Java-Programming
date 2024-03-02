/*
     Q) Create a form using JFrame to collect the records of students in Trinity. Each record should contain the
        following information:
            a) First Name (JTextField)
            b) Last Name (JTextField)
            c) Age (JTextField)
            d) Gender (JRadioButton)
            e) Faculty (JComboBox/JList)
            f) Semester (JComboBox/JList)
            g) Remarks (JTextArea)
         Add both menus and toolbars to save the form to a file (display a save dialog). Also add menu/toolbar items
          to reset the form as well as exit the program. Remember to close the file on exit command
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class Qno9BMCstudentrecordread extends JFrame
{
    public static void main(String[] args)
    {
        Qno9BMCstudentrecordread frame = new Qno9BMCstudentrecordread();
        frame.setVisible(true);
        frame.setBounds(500,100,500,800);
        frame.setTitle("Student Records");
    }

    JTextField firstNameField,lastNameField,ageField;
    JRadioButton maleRadioButton,femaleRadioButton;
    JComboBox facultyComboBox,semesterComboBox;
    JTextArea remarksTextArea;
    ButtonGroup group;
    public Qno9BMCstudentrecordread()
    {
        setLayout(new GridLayout(18,0));

//****************************** For MenuBar, Menu and MenuItem *****************************************************************
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
//Sets the created JMenuBar as the menu bar for the frame or window. 

        JMenu fileMenu = new JMenu("File");
        
        menuBar.add(fileMenu);
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);
        JMenuItem resetMenuItem = new JMenuItem("Reset");
        fileMenu.add(resetMenuItem);
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

//********************** For JToolBar ******************************************************************************************

        ImageIcon resetIcon = new ImageIcon("resetIcon.png");
        ImageIcon saveIcon = new ImageIcon("saveIcon.png");
        ImageIcon exitIcon = new ImageIcon("exitIcon.png");

        JToolBar toolBar = new JToolBar();
        add(toolBar);

        JButton saveButton = new JButton(saveIcon);
        toolBar.add(saveButton);
        JButton resetButton = new JButton(resetIcon);
        toolBar.add(resetButton);
        JButton exitButton = new JButton(exitIcon);
        toolBar.add(exitButton);


//************************ For JTextField,CheckBox and ComboBox ********************************************************************

        JLabel title = new JLabel("Students Record");
        add(title);

        JLabel firstNameLabel = new JLabel("FirstName:");
        firstNameField = new JTextField(10);

        JLabel lastNameLabel = new JLabel("LastName:");
        lastNameField = new JTextField(10);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(10);

        JLabel genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        JLabel facultyLabel = new JLabel("Faculty:");
        String[] facultyList ={"BSC/CSIT","BBM","BIT","Engineering"};
        facultyComboBox = new JComboBox(facultyList);

        JLabel semesterLabel = new JLabel("Semester:");
        String[] semesterList ={"1st Semester","2nd Semester","3rd Semester","4th Semester","5th Semester",
                                "6th Semester","7th Semester","8th Semester"};
        semesterComboBox = new JComboBox(semesterList);

        JLabel remarksLabel = new JLabel("Remarks:");
        remarksTextArea = new JTextArea();


//*********************************************** Adding Label, Fields,RadioButtons, ComboBox and TextArea***********************
        add(firstNameLabel);
        add(firstNameField);

        add(lastNameLabel);
        add(lastNameField);

        add(ageLabel);
        add(ageField);
        
        add(genderLabel);
        group = new ButtonGroup();

        add(maleRadioButton);
//Adds a radio button ("Male" option) to the container.
        add(femaleRadioButton);
//Adds a radio button ("feMale" option) to the container.
        group.add(maleRadioButton);
//Adds the "Male" radio button to the ButtonGroup.This implies that the 
//"Male" radio button is part of a group, and if another radio button from 
// same group is selected, the "Male" radio button will be deselected
        group.add(femaleRadioButton);

        add(facultyLabel);
        add(facultyComboBox);

        add(semesterLabel);
        add(semesterComboBox);

        add(remarksLabel);
        add(remarksTextArea);

//******************** ActionListener For JButton on ToolBar *****************************************************************************************

        saveButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                String[] text = getFieldValue();
                try
                {
                	//Tries to call the saveFormData method,
                    saveFormData(text);
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        });

        resetButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                resetMethods();

            }
        });
        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.exit(0);
            }
        });

//**************** Action Listener For JMenuItem on Menu ********************************************************************************
        saveMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                String[] text = getFieldValue();
                try
                {
                    saveFormData(text);
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        });
        resetMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                resetMethods();
            }
        });
        exitMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.exit(0);
            }
        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

//********************** Methods for Reset and Save ********************************************************************************
    private void resetMethods()
    {
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        group.clearSelection();
        facultyComboBox.setSelectedIndex(0);
        semesterComboBox.setSelectedIndex(0);
        remarksTextArea.setText("");
    }

    private String[] getFieldValue()
    {
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
//When the female radio button is selected, 
        //the associated action command will be "Female".
//The setActionCommand method is used to set an action command for the 
// radio buttons. The action command is a string that can be associated 
//with a particular component in a GUI, and it is often used to identify
//or categorize the action triggered by that component.
        String[] text = {
                firstNameField.getText(),
                lastNameField.getText(),
                ageField.getText(),
                group.getSelection().getActionCommand(),
                (String)facultyComboBox.getSelectedItem(),
                (String)semesterComboBox.getSelectedItem(),
                remarksTextArea.getText()
        };
        return text;
    }
    private void saveFormData (String[] text) throws IOException
    {
        String userDir = System.getProperty("user.home");
        //Retrieves the user's home directory path
        JFileChooser chooser = new JFileChooser(userDir+"/Desktop");
//Creates a file chooser dialog initialized 
        //to open in the user's desktop directory.
        
        chooser.setFileFilter(new FileNameExtensionFilter
        		("Text Files (*.txt)", "txt"));
//Sets a file filter for the file chooser, 
        //restricting it to show only files with a .txt extension.
        chooser.setSelectedFile(new File(".txt"));
//Sets the default selected file name in the file chooser to ".txt"
        
        int result = chooser.showSaveDialog(this);
//Displays the "Save" dialog.
 //The user can choose a file location and name to save the data.
        if(result == JFileChooser.APPROVE_OPTION)
        {
//Checks if the user clicked the "Save" button in the file chooser.
            File file = chooser.getSelectedFile();
//Retrieves the selected file from the file chooser.

            PrintWriter out = null;
 //Initializes a PrintWriter to write data to the selected file
            try
            {

                out = new PrintWriter(file);
//Creates a PrintWriter instance to write to the selected file
                for (int i=0; i<text.length; i++)
                {

                    out.print(text[i]+"\n");
//Writes each element of the text array to the file, 
                    //separating them with a newline character.
                }
            }
            finally
            {
                out.close();
            }
        }
        else
            return;
    }
}