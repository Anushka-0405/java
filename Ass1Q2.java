import java.io.*;
public class Ass1Q2{
  public static void main(String [] args)throws IOException{
int no;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a no ");
no=Integer.parseInt(br.readLine());
int rev=0;
int temp=no;
while(no!=0)
{
int rem=no%10;
rev=(rev*10)+rem;
no=no/10;
}

System.out.println("reversed is "+rev);
}
}