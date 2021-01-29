package multithreading;

import java.util.ArrayList;
import java.util.Map;



class emp{

	String name ;
	int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	
	
}


class emp2{
	
	
	int id ;
	
	String email;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public emp2(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	
	
	
	
}
public class Sample2 {
	

	  public static void main(String args[]) {
	  
	
	  ArrayList<emp> Emp = new ArrayList<emp>();
	  
	  emp e1 = new emp("Sampu",10);
	  emp e2 = new emp("Apurva",20);
	  emp e3 = new emp("Nishant",30);

	  Emp.add(e1);
	  Emp.add(e2);
	  Emp.add(e3);

	  ArrayList<emp2> Emp2 = new ArrayList<emp2>();
	  
	  emp2 e12 = new emp2(10,"sampada@mail.com");
	  emp2 e22 = new emp2(20,"apurva@gmail.com");
	  emp2 e32 = new emp2(30,"nishant@yahoo.com");
	  
	  Emp2.add(e12);
	  Emp2.add(e22);
	  Emp2.add(e32);
	  
	  
	  int len = Emp.size();
	  

	  
	  
	  Thread t1 = new Thread(new Runnable() {
		  
		  int var =0;
		  
		  
		@Override
		public void run() {
			for(int i =0;i<len-1;i++) {
				
			emp obj = Emp.get(i);
			System.out.println("Name:--"+obj.getName()+" Id:-"+obj.getId());
			var++;
			}
			
			System.out.println("Exiting thread 1 ");
			}
		
	});
	  Thread t2 = new Thread(new Runnable() {
		  
		  int var =0;
		  
		  
		@Override
		public void run() {
			
			for(int i =0;i<len-1;i++) {
			emp2 obj = Emp2.get(i);
			System.out.println("Id:--"+obj.getId()+" Email:-"+obj.getEmail());
			}
			System.out.println("Exiting thread 2");
			var++;
			}
		
	});
	  
	  
	 
	  
	  t1.start();
	  t2.start();
	  
	  }
	
}

 
 