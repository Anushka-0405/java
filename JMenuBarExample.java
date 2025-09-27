package swing;

import javax.swing.*;
import java.awt.event.*;

public class JMenuBarExample extends JFrame {

    public JMenuBarExample() {
        setTitle("JMenuBar Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();  // Separator line
        fileMenu.add(exitItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set menu bar to frame
        setJMenuBar(menuBar);

        // Add action listener to exit menu item
        exitItem.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JMenuBarExample().setVisible(true);
        });
    }
}
