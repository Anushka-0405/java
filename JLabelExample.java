package swing;

import javax.swing.*;

public class JLabelExample {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("JLabel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a label with some text
        JLabel label = new JLabel("Hello, this is a JLabel!");

        // Add the label to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
