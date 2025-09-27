package javaprograms;

public class MyDate {
	int dd,mm,yyyy;
	 public MyDate() {
    	 dd=22;
    	 mm=04;
    	 yyyy=2002;             
    	 System.out.println(+dd+"/"+mm+"/"+yyyy);   
     }
	 public MyDate(int x,int y,int z) {
    	 this.dd=x;
    	 this.mm=y;
    	 this.yyyy=z;
    	 System.out.println(+dd+"/"+mm+"/"+yyyy);   
     }
	public static void main(String[] args) {
    MyDate d=new MyDate();

	 MyDate d1=new MyDate(2,12,2012);
       
	}
}
