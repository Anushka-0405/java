package swing;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.*;
import javax.swing.*;

public class SimpleFrame {
    public static void main(String[] args) {
        // Create a JFrame with title
        JFrame frame = new JFrame("My First JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set size (width=400, height=300)
        frame.setSize(400, 300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        frame.add(panel);

        // Specify what happens when user closes the window
        

        // Add a label to frame
        JLabel label = new JLabel("Hello, JFrame!", SwingConstants.CENTER);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
