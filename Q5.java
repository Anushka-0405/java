package Assignment;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("ENter size of array");
		int size=scr.nextInt();
		int[] NO= new int[size];
		System.out.println("Enter"+size+"Elements");
	    for(int i=0;i<size;i++) {
	    NO[i]=scr.nextInt();
	    }
		
		int sum=0;
		for(int i=0;i<NO.length;i++) {
			sum=sum+NO[i];
		}
		System.out.println(sum);

	}

}
