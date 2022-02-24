package JDBCEngg1.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlcommands {

	

		
		 public static void main( String[] args )
		    {
		    	try {
		    		
		    		Class.forName("com.mysql.cj.jdbc.Driver");
		    		
		    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "25Feb1998@");
		    		
		    		Statement st = con.createStatement();
		    		
		    		
		    		st.executeUpdate("insert into student values(8,'Ram',40)");
		    	System.out.println("inserted succesfully into table");

			
		    		st.executeUpdate("update student set name='Jay' where id=3 ");
		    		System.out.println("Updated successfully ");
		    		

		
		    	st.executeUpdate("delete from student where id=4 ");
		    	System.out.println("  delete succesfully into table");
		    		
		    		
		    		
		    		
		    		ResultSet rs = st.executeQuery("select * from student");
		    		while(rs.next()) {
		    			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getInt(3));
		    			
		    		}
		    		con.close();
		    	}
		    	catch(Exception e) {
		    		System.out.println(e);
		    	}
		    }
		


	}



