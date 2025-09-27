package javaprograms;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a no");
	int a=s.nextInt();
	if(a%2==0) {
	System.out.println("No is even");
	}
	else {
		System.out.println("No is odd");
	}

	}

}
