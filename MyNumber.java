package javaprograms;
import java.util.Scanner;
public class MyNumber {
 private int n;
 public MyNumber(){
	 n=0;
 }
 public MyNumber(int no){
	n=no;
 }
public void Isnegative (int n) {
	if(n<0) {
		System.out.println("no is negative");
	}
}

public void Ispositive (int n) {
	if(n>0) {
		System.out.println("no is positive");
	}
}

public void Iseven (int n) {
	if(n%2==0) {
		System.out.println("no is even");
	}
}

public void Isodd (int n) {
	if(n%2!=0) {
		System.out.println("no is odd");
	}
}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a no");
	int n=sc.nextInt();
	
	MyNumber a=new MyNumber();
	MyNumber a1=new MyNumber(n);
	a1.Isnegative(n);
	a1.Ispositive(n);
	a1.Iseven(n);
	a1.Isodd(n);
	}

}
