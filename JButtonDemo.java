package swing;
import java.awt.event.*; 
import javax.swing.*;  
import java.awt.*; 
public class JButtonDemo extends JFrame implements ActionListener 
{ 
JTextField jtf,jtd;  
JButton jb,jb1; 
JLabel bL,bl,b;
public JButtonDemo() 
{ 
	
	setLayout(new FlowLayout());   
	bL=new JLabel("Username");
	add (bL);
 jtf = new JTextField(15); 
add (jtf); 
 
bl=new JLabel("Password");
add (bl);
setLayout(new FlowLayout());
jtd = new JTextField(15); 
add(jtd);

jb = new JButton ("Login"); 
jb.addActionListener (this); 
add(jb); 
jb1 = new JButton ("Reset"); 
jb1.addActionListener (this); 
add(jb1);
setSize(300,125); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setVisible(true); 
} 
public void actionPerformed(ActionEvent ae) 
{ 
jtf.setText (ae.getActionCommand()); 
} 
public static void main(String[] args) 
{ 
 new JButtonDemo(); 
} 
} 