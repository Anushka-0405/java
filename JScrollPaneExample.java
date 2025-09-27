package swing;

import javax.swing.*;

public class JScrollPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JTextArea (multi-line text)
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true);  // Wrap lines to fit width
        textArea.setWrapStyleWord(true);  // Wrap at word boundaries

        // Put the JTextArea inside a JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the scroll pane (with text area inside) to the frame
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
