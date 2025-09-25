import java.io.*;
public class Ass1Q1{
  public static void main(String [] args)throws IOException{
int no;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a no for multiplication table");
no=Integer.parseInt(br.readLine());

for(int i=1;i<=10;i++)
{
    System.out.println(+no+"*"+i+"="+(no*i));
}
}
}