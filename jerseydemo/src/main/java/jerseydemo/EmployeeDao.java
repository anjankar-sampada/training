package jerseydemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class EmployeeDao {

	public List<Employee> getAllEmployeeList() {

		List<Employee> employeeList = null;

		// database connection

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee2", "root", "Sam1234$@");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			employeeList = new ArrayList<>();
			while (rs.next()) {
				// Retrieve by column name
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");

				employeeList.add(new Employee(id,name,dept));
				
			}
			rs.close();
			st.close();
			con.close();

			
		} catch (Exception e) {
			System.out.println(e);

		}
		return employeeList;

	}
	
	public static Integer insert(Employee employee) {
		Integer id=employee.getId();
		String name=employee.getName();
		String dept=employee.getDept();
		String querystr="INSERT INTO employee(id,name,dept) Values("+id+",'"+name+"','"+dept+"')";
		Integer isInserted=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee2", "root", "Sam1234$@");
			Statement st = con.createStatement();
			isInserted = st.executeUpdate(querystr);
			st.close();
			con.close();

			}
		
		catch (Exception e) {
			System.out.println(e);

		}
		return isInserted;
		
		
		
	}
	
	public static Integer delete(Employee employee) {
		Integer id=employee.getId();
				String querystr="DELETE FROM employee WHERE id='"+id+"'";
		Integer isDeleted=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee2", "root", "Sam1234$@");
			Statement st = con.createStatement();
			isDeleted = st.executeUpdate(querystr);
			st.close();
			con.close();

			}
		
		catch (Exception e) {
			System.out.println(e);

		}
		return isDeleted;
		
		
		
	}
  
	public static Integer update(Employee employee) {
		Integer id=employee.getId();
		String name=employee.getName();
		String dept=employee.getDept();
				String querystr="Update employee  set name='"+name+"' ,dept='"+dept+"' WHERE id='"+id+"'";
		Integer isUpdated=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee2", "root", "Sam1234$@");
			Statement st = con.createStatement();
			isUpdated = st.executeUpdate(querystr);
			st.close();
			con.close();

			}
		
		catch (Exception e) {
			System.out.println(e);

		}
		return isUpdated;
		
		
		
	}
	

		
	}
	
	

