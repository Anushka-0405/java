package ass;



class Series{
	public int n;
	
	public Series(){
		n=10;
	}
	
	public Series(int n) {
		this.n=n;
	}

}

 class cube extends Series{
	 public cube() {
		 super();
	 }
	 
	 public cube(int n) {
		 super(n);
	 }
	 public void display() {
	 System.out.println("Cube of no is "+(n*n*n));
 }
	 
 }
 
 class Squ extends Series{
	 public Squ() {
		 super();
	 }
	 
	 public Squ(int n) {
		 super(n);
	 }
	 public void display() {
	 System.out.println("Square of no is "+(n*n));
 }
	 
	 class Fibb extends Series{
		 public Fibb() {
			 super();
			 int a = 0, b = 1;
		 }
		 
		 public Fibb(int n) {
			 super(n);
		 }
		 
	        System.out.print("Fibonacci Series: " + a + " " + b);

	        for (int i = 2; i < n; i++) {
	            int c = a + b;
	            System.out.print(" " + c);
	            a = b;
	            b = c;
	        }
		
	 
	 
	 
 }



public class setAQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       cube c=new cube();
       cube c1=new cube(3);
       Squ s=new Squ();
       Squ s1=new Squ(3);
       c.display();
     c1.display();
     s.display();
     s1.display();
	}

}
