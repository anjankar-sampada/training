package jerseydemo;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employeeservice")

public class EmployeeService   {

	EmployeeDao employeeDao = new EmployeeDao();

	@GET
	@Path("/empList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> displayEmployee() {

		return employeeDao.getAllEmployeeList();
	
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response add(Employee employee) {
	 Integer isInserted=EmployeeDao.insert(employee);
	if(isInserted>0) {
		return Response.status(Response.Status.CREATED).entity("Employee Inserted").build();
	}
	else {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error").build();
	}
	}
	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)

	public Response delete(Employee employee) {
		 Integer isDeleted=EmployeeDao.delete(employee);
		if(isDeleted>0) {
			return Response.status(Response.Status.CREATED).entity("Employee Deleted").build();
		}
		else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error").build();
		}
		}
	
	/***
	 * 
	 * @param employee
	 * @return
	 */
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)

	public Response update(Employee employee) {
		 Integer isUpdated=EmployeeDao.update(employee);
		if(isUpdated>0) {
			return Response.status(Response.Status.CREATED).entity("Employee Updated").build();
		}
		else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error").build();
		}
		}

}