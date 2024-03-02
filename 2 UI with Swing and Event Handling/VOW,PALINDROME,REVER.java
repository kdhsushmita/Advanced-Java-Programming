import java.awt.event.*;
import javax.swing.*;

class Qno4GUIform extends JFrame implements ActionListener {
    JTextField inputField;
    JLabel messageLabel, resultLabel;
    JButton checkPalindromeButton, reverseButton, findVowelsButton;

    public Qno4GUIform() {
        messageLabel = new JLabel("Input any string:");
        messageLabel.setBounds(20, 20, 150, 20);
        inputField = new JTextField(20);
        inputField.setBounds(180, 20, 200, 20);

        checkPalindromeButton = new JButton("Check Palindrome");
        checkPalindromeButton.setBounds(20, 50, 150, 30);
        checkPalindromeButton.addActionListener(this);

        reverseButton = new JButton("Reverse");
        reverseButton.setBounds(180, 50, 150, 30);
        reverseButton.addActionListener(this);

        findVowelsButton = new JButton("Find Vowels");
        findVowelsButton.setBounds(340, 50, 150, 30);
        findVowelsButton.addActionListener(this);

        resultLabel = new JLabel();
        resultLabel.setBounds(20, 90, 470, 20);

        add(messageLabel);
        add(inputField);
        add(checkPalindromeButton);
        add(reverseButton);
        add(findVowelsButton);
        add(resultLabel);

        setSize(600, 150);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        String result = "";

        if (e.getSource() == checkPalindromeButton) {
            result = isPalindrome(input) ? "Palindrome" : "Not Palindrome";
        } else if (e.getSource() == reverseButton) {
            result = reverseString(input);
        } else if (e.getSource() == findVowelsButton) {
            result = findVowels(input);
        }

        resultLabel.setText(result);
    }

    private boolean isPalindrome(String str) {
    	//StringBuilder object
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private String findVowels(String str) {
        StringBuilder vowels = new StringBuilder();
        // iterates through each character in the input string 
        //using a for-each loop
        for (char ch : str.toCharArray()) {
        	//For each character, it checks if it is a vowel 
        	//"AEIOUaeiou" using indexOf. If the index is not -1, 
        	//it means the character is a vowel, 
        	//and it is appended to the vowels StringBuilder.
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowels.append(ch);
            }
        }
        return vowels.toString();
    }

    public static void main(String[] args) {
        new Qno4GUIform();
    }
}
