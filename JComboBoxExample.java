package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxExample extends JFrame {

    public JComboBoxExample() {
        setTitle("JComboBox Example");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create options for combo box
        String[] options = { "Option 1", "Option 2", "Option 3", "Option 4" };

        // Create combo box
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Label to show selected option
        JLabel label = new JLabel("Select an option");

        // Add action listener to combo box
        comboBox.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            label.setText("Selected: " + selected);
        });

        // Layout components vertically
        setLayout(new FlowLayout());
        add(comboBox);
        add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JComboBoxExample().setVisible(true);
        });
    }
}
