package JDBCEngg1.com;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class sqluser_input {
      public static void main(String[] args) {
				
	    	try {
			     Class.forName("com.mysql.cj.jdbc.Driver");
			     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "25Feb1998@");
			   	 PreparedStatement st = con.prepareStatement("insert into student values(?,?,?)");
			     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    		
			    		do {
			    		System.out.println("enter id");
			    		int sid = Integer.parseInt(br.readLine());
			    		
			    		System.out.println("enter name");
			    		String sname= br.readLine();
			    		
			    		System.out.println("enter age");
			    		int age = Integer.parseInt(br.readLine());
			    		
			    		st.setInt(1, sid);
			    		st.setString(2, sname);
			    		st.setInt(3, age);
			    		
			    	st.executeUpdate();
			    	System.out.println("insert successfully");
			    		
			    	System.out.println("Do you want to continue: y/n");
			    	String s = br.readLine();
			    	
			    	if(s.startsWith("n")) {
			    	break;	
			    	}
			    	}while(true);
			    		
			    		
			    		con.close();
			    	}
			    	catch(Exception e) {
			    		System.out.println(e);
			    	}
				}

			


		}



	  
		  
		


	


