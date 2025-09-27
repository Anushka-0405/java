package javaprograms;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=scr.nextInt();
       int[] array=new int[size];
       System.out.println("Enter"+size+"element");
       for(int i=0;i<size;i++) {
    	   array[i]= scr.nextInt();
       }
       //Summation of array
       int sum=0;
       for(int i=0;i<size;i++) {
    	   System.out.println(array[i]+" ");
    	  sum=sum+array[i];
    	 
       }
       System.out.println("Sum is"+sum);
       //Addition of array
      // System.out.println(Arrays.toString(array));
       Arrays.sort(array);
       System.out.println(Arrays.toString(array));
      scr.close();
	}
 
}
