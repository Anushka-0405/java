package swing;

import javax.swing.*;

public class JButtonMultilineExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiline JButton");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use HTML tags to insert line breaks <br> inside the button text
        JButton button = new JButton("<html>Click<br>Me!</html>");

        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
