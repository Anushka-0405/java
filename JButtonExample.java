package swing;

import javax.swing.*;
import java.awt.event.*;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button with text
        JButton button = new JButton("Click Me!");

        // Add action listener to handle button click
        button.addActionListener(e -> {
            System.out.println("Button was clicked!");
            JOptionPane.showMessageDialog(frame, "You clicked the button!");
        });

        // Add button to the frame
        frame.add(button);

        // Center the frame and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
