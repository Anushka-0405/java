package Assignment;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
      Scanner scr=new Scanner(System.in);
      System.out.println("Enter a no for multiplication table");
      int no=scr.nextInt();
      for(int i=1;i<=10;i++) {
    	  System.out.println(no+"*"+i+"="+(no*i));
      }
	}

}
