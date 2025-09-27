package Assignment;
import java.util.Scanner;
class product{
	int id;
	String name;
	double price;
	
	
	product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	void display() {
		System.out.println("ID"+id+"name"+name+"price"+price);
		
	}
}
public class Q6{

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		 product[] products = new product[5];
		 for (int i = 0; i < products.length; i++) {
	            System.out.println("Enter details for product " + (i + 1) + ":");
	            System.out.print("Enter ID: ");
	            int id = scr.nextInt();
	            scr.nextLine();  // consume newline

	            System.out.print("Enter Name: ");
	            String name =scr.nextLine();

	            System.out.print("Enter Price: ");
	            double price = scr.nextDouble();

	            products[i] = new product(id, name, price);
	        }

	        // Display all product details
	        System.out.println("\nStored Product Information:");
	        for (product p : products) {
	            p.display();
	        }

	        scr.close();
	    }
	}
	

 
