package javaprograms;
import java.util.Scanner;


public class leepyear {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=s.nextInt();
		if(year%2==0) {
		System.out.println("year is leep Year");
		}
		else {
			System.out.println("Year is not leep year");
		}

		}
}
