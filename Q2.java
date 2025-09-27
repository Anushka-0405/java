package Assignment;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
	 Scanner scr=new Scanner(System.in);
     System.out.println("Enter a no");
     int no=scr.nextInt();
    long fact=1;
     for(int i=1;i<=no;i++) {
     fact=fact*i;
   }
     System.out.println(fact);
  }
}