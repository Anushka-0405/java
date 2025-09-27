package javaprograms;

public class Account {
	int accno;
	String accname;
	int balance;
	Account(int accno,String accname,int balance){
		this.accno=accno;
		this.accname=accname;
		this.balance=balance;
	}
	
	public void display() {
		System.out.println("\n Account Number : "+accno+"\t Account Name : "+accname+"\t Balance"+balance);
	}
	
	public void static main(string[],args) {
		
	}
}
