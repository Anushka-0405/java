package javaprograms;
import java.io.*;
public class A {

	public static void main(String[] args) {
	   Console username=System.console();
		//String s = consol.readLine("Enter your name");
		//System.out.println("name is "+s);        
		String user = username.readLine("Enter your username: ");
    System.out.println("you enter string is "+user);
	}

}
