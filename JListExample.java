package swing;
import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Data for the list
        String[] fruits = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

        // Create JList with the array data
        JList<String> list = new JList<>(fruits);

        // Put the JList inside a JScrollPane for scrollbars
        JScrollPane scrollPane = new JScrollPane(list);

        // Add the scroll pane (with list) to the frame
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}

