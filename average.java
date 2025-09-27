package javaprograms;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter no of values");
	    int a=s.nextInt();
	    double d=0;
        
        for(int i=0;i<a;i++) {
        	System.out.println("Enter value for average");	
        double b=s.nextDouble();
        d+=b;
        //System.out.println(d);
       }
        //System.out.println(d);
        //System.out.println(a);
        
        double e=s.nextDouble();
         e= (d/a);
        System.out.println(e);
         //System.out.println("average  is"+c);
        s.close();
	}

}
