package Assignment;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("Enter a no");
		int no=scr.nextInt();
		
		for(int i=1;i<=no;i++) {
			System.out.println(a+" ");
			int next=a+b;
			a=b;
			b=next;
		}
	}

}
