package jdbc;

//STEP 1. Import required packages

import java.sql.*;

public class JdbcConnectivity {
	
public static void main(String[] args) throws Exception {
	
	//STEP 2: Register JDBC driver
Class.forName("com.mysql.cj.jdbc.Driver");


//STEP 3: Open a connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Employee","root","Sam1234$@");
System.out.println("Connected database successfully...");
Statement st=con.createStatement();


ResultSet rs=st.executeQuery("select * from Employees");

while(rs.next()){
    //Retrieve by column name
    int id  = rs.getInt("id");
    int age = rs.getInt("age");
    String first = rs.getString("first");
    String last = rs.getString("last");

    //Display values
    System.out.print("ID: " + id);
    System.out.print(", Age: " + age);
    System.out.print(", First: " + first);
    System.out.println(", Last: " + last);
 }
 
 
 
 //to delete data
 String sql = "DELETE FROM Employees WHERE id = 101";
st.executeUpdate(sql);

System.out.println("Deleted Row  successfully...");
 
//Now you can extract all the records
// to see the remaining records
sql = "SELECT * FROM Employees ";
 rs = st.executeQuery(sql);

while(rs.next()){
   //Retrieve by column name
   int id  = rs.getInt("id");
   int age = rs.getInt("age");
   String first = rs.getString("first");
   String last = rs.getString("last");

   //Display values
   System.out.print("ID: " + id);
   System.out.print(", Age: " + age);
   System.out.print(", First: " + first);
   System.out.println(", Last: " + last);
}


//inserting the row
System.out.println("Inserting new row");
 sql = "INSERT INTO Employees Values(101,21,'Sampada','Anjankar')";
st.executeUpdate(sql);
sql = "SELECT * FROM Employees ";
 rs = st.executeQuery(sql);

while(rs.next()){
	   //Retrieve by column name
	   int id  = rs.getInt("id");
	   int age = rs.getInt("age");
	   String first = rs.getString("first");
	   String last = rs.getString("last");

	   //Display values
	   System.out.print("ID: " + id);
	   System.out.print(", Age: " + age);
	   System.out.print(", First: " + first);
	   System.out.println(", Last: " + last);
	}
	
	System.out.println("Inserted  Row  successfully...");
	
//updating the record
	System.out.print("Updating the record");
	 sql="Update Employees SET age=22 WHERE id =101";
	st.executeUpdate(sql);
	
	sql="Select * FROM Employees WHERE id=101";
    rs=st.executeQuery(sql);
	
	rs.next();
		 //Retrieve by column name
		   int id  = rs.getInt("id");
		   int age = rs.getInt("age");
		   String first = rs.getString("first");
		   String last = rs.getString("last");

		   //Display values
		   System.out.print("ID: " + id);
		   System.out.print(", Age: " + age);
		   System.out.print(", First: " + first);
		   System.out.println(", Last: " + last);
		
		   
		   //  records in descending order according to id
System.out.println("Fetching records in Descending order");
sql="SELECT * FROM Employees ORDER BY id DESC";
rs=st.executeQuery(sql);

while(rs.next()){
	   //Retrieve by column name
	   int id1  = rs.getInt("id");
	   int age1 = rs.getInt("age");
	   String first1 = rs.getString("first");
	   String last1 = rs.getString("last");

	   //Display values
	   System.out.print("ID: " + id1);
	   System.out.print(", Age: " + age1);
	   System.out.print(", First: " + first1);
	   System.out.println(", Last: " + last1);
	}
	
rs.close();
 st.close();
 con.close();
}
	

}
