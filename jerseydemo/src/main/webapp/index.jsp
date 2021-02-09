<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<script>  
         $(document).ready(function () {  
             $("#add").click(function () {  
               /*  var employee = new Object(); 
                 employee.id=$('#id').val();
                 employee.name = $('#name').val();  
                 employee.dept = $('#dept').val();
                 alert(employee.id+" "+employee.name+" "+employee.dept+"  inserted successfully");*/
                 var id = document.empform.id.value;
                 var name = document.empform.name.value;
                 var dept = document.empform.dept.value;
                 alert("inserted Successfully");
                 var employee = {"id":id,"name":"name","dept":"dept"};
                 $.ajax({  
                     url: 'http://localhost:8080/jerseydemo/employee/employeeservice/add',  
                     type: 'POST',
                     processData: false,
                     dataType: 'json',
                     contentType: 'application/json',
                     data: JSON.stringify(employee)  
                       
                 });  
             });  
         });
         
         $(document).ready(function () {  
             $("#update").click(function () {  
                
                 var id = document.empform.id.value;
                 var name = document.empform.name.value;
                 var dept = document.empform.dept.value;
                 
                 alert("updated Successfully");
                 var employee = {"id":id,"name":"name","dept":"dept"};
                 $.ajax({  
                     url: 'http://localhost:8080/jerseydemo/employee/employeeservice/update',  
                     type: 'PUT',
                     processData: false,
                     dataType: 'json',
                     contentType: 'application/json',
                     data: JSON.stringify(employee)  
                       
                 });  
             });  
         });  
         
         $(document).ready(function () {  
             $("#delete").click(function () {  
                 
                 var id = document.empform.id.value;
                 
                 alert("deleted Successfully");
                 var employee = {"id":id};
                 $.ajax({ 
                	
                     url: 'http://localhost:8080/jerseydemo/employee/employeeservice/delete',  
                     type: 'DELETE',
                     processData: false,
                     dataType: 'json',
                     contentType: 'application/json',
                     data: JSON.stringify(employee)  
                       
                 });  
             });  
         });  
    </script>  
</head>



<body>
	  <a href="http://localhost:8080/jerseydemo/employee/employeeservice/empList">Get Employee List</a>

	<form align="center" name="empform" method="post">
		<h2>Employee Details</h2>
		<label for="id"> id:</label>
		 <input type="text" name="id" id="id"> <br>
		<br> 
		<label for="name">Name:</label>
		 <input type="text"  name="name"  id="name"> <br> <br>
		  <label for="dept">Department:</label>
		<input type="text" name="dept" id="dept"> <br> <br>
		<button id="add">Add</button>
		<button id="update">Update</button>
		<button id="delete">Delete</button>


	</form>
	
	
</body>
</html>
