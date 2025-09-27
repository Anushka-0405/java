package ass;



class Series{
	public int n;
	
	public Series(){
		n=10;
	}
	
	public Series(int n) {
		this.n=n;
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
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
//	       Series s=new Series();
//	       Series s1=new Series(2);
           cube c=new cube();
	       cube c1=new cube(2);
	       c.display();
	      c1.display();
//	       s.display();
		}
 }
}