package swing;

import javax.swing.*;

public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JTextField textField = new JTextField(20);
        frame.add(textField);

        frame.setVisible(true);
    }
}