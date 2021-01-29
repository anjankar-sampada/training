package training;
import java.util.*;

class Employee implements Comparable<Employee>{  
int empid;  
String name,email;  
long phone;  
Employee(int empid,String name,String email,long phone){  
this.empid=empid;  
this.name=name;
this.email=email;
this.phone=phone;  
}  
  
public int compareTo(Employee em){  
if(empid==em.empid)  
return 0;  
else if(empid<em.empid)  
return 1;  
else  
return -1;  
}  
}  
public class Asthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(101,"Sampada Anjankar","sampada@gmail.com",123456780));  
		al.add(new Employee(106,"Nishant Gosavi","nishant@gmail.com",1234567890));  
		al.add(new Employee(105,"Sharda","sharda@gmail.com",1234567890));  
		  
		Collections.sort(al);  
		for(Employee em:al){  
		System.out.println(em.empid+" "+em.name+" "+em.email+" "+em.phone);  
		}  
	}
}
