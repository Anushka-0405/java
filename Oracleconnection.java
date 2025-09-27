package Oracle;
import java.sql.Connection;
import java.sql.DriverManagers;
import java.sql.Resultset;
import java.sql.Statement;

public class Oracleconnection {
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManagers.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","123");
		Statement st=con.createStatement();
	    String query="select * from employee ";
		Resultset rs=st.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
		rs.close(); 
		st.close();
		con.close();
	
		
	}

}
