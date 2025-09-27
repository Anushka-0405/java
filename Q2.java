
package swing;
import java.awt.event.*; 
import javax.swing.*;  
import java.awt.*; 
public class Q2 extends JFrame implements ActionListener 
{ 
JTextField jtf,jtd;  
JButton jb,jb1; 
JLabel bL,bl,b;
public Q2() 
{ 
	JFrame frame=new JFrame("Multiple button");
	setLayout(new FlowLayout());   
	bL=new JLabel("<html>Vaccination Details:<br></html>",SwingConstants.CENTER);
	  bL.setAlignmentX(Component.CENTER_ALIGNMENT);
//	bL.setVerticalAlignment(SwingConstants.CENTER);
       frame.add(bL);
 frame.setVisible(true);
	add (bL); 
 
bl=new JLabel("<html>Name<br>");
bl.setAlignmentX(Component.LEFT_ALIGNMENT);
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
setSize(350,400); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setVisible(true); 
} 
public void actionPerformed(ActionEvent ae) 
{ 
jtf.setText (ae.getActionCommand()); 
} 
public static void main(String[] args) 
{ 
 new Q2(); 
} 
} 