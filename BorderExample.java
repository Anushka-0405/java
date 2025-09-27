package swing;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class BorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);

        // Add a border (e.g., LineBorder with color black and thickness 3)
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // Add some content inside the panel
        panel.add(new JLabel("Panel with border"));

        // Add panel to frame
        frame.add(panel);

        frame.setVisible(true);
    }
}

