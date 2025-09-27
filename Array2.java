package javaprograms;
import java.util.Scanner;
public class Array2 {
        
	public static void main(String[] args) {
		 Scanner scr=new Scanner(System.in);
		 System.out.println("Enter no of rows");
		 int rows=scr.nextInt();
		 System.out.println("Enter no of cloumns");
		 int col=scr.nextInt();
		 
		 int[][] array=new int[rows][col];
		 
		 System.out.println("Enter"+(rows*col)+"Element");
		 
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<col;j++) {
				 System.out.println("Elementt at["+i+"]["+j+"]:");
				 array[i][j]=scr.nextInt();
				 
			 }
		 }
		 
		 System.out.println("2 D array elements");
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<col;j++) {
				 System.out.println(array[i][j]);
			 }
		System.out.println();
		 }
				 scr.close();
		 }

}
