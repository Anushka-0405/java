package javaprograms;
import java.util.Scanner;
public class calculateSGPA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Subject");
		int no=sc.nextInt();
		double[] gradepoints=new double[no];
		double[] credit= new double[no];
		double pointsum=0;
		double creditsum=0;
		
		
		
		
		for(int i=0;i<no;i++) {
		System.out.println("Enter grade point");
		gradepoints[i]=sc.nextDouble();
		System.out.println("ENter credit");
		credit[i]=sc.nextDouble();
		
		pointsum+=credit[i]*gradepoints[i];
		creditsum+=credit[i];
		
		}
		double sgpa=pointsum/creditsum;
		System.out.println("your sgpa is"+sgpa);
		sc.close();
		 

	}

}
