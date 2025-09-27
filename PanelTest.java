package ass;



import java.awt.*; 
import javax.swing.*; 

public class PanelTest extends JFrame  
{ 
    private JButton b, b1, b2; 
    private JLabel l; 

    public PanelTest() 
    { 
        l = new JLabel("panel label"); 
        b = new JButton("button1"); 
        b1 = new JButton("button2"); 
        b2 = new JButton("button3"); 

        JPanel p = new JPanel(); 
        p.add(b); 
        p.add(b1);
        p.add(b2); 
        p.add(l); 

        p.SetBackground(Color.red); 
        add(p); 

        setSize(300, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
    } 

    public static void main(String[] args) 
    { 
        PanelTes p = new PanelTes (); 
    } 

}