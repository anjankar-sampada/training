package training;

import java.util.ArrayList;
import java.util.Collections;




public class StudentDemo {
	
	public static void main(String args[]) {
		
		ArrayList<Student2> studd = new ArrayList<Student2>();
		
		studd.add(new Student2( "Zues", 5));
		studd.add(new Student2( "Sampada", 4));
		studd.add(new Student2( "Apurva", 8));
		studd.add(new Student2( "Shivam", 7));
		studd.add(new Student2( "Gulshan", 6));
		
		
		
		Collections.sort(studd);
		
	System.out.println("Roll Numbers greater than 4");
		
		for(Student2 s : studd) {
		int roll =s.getRollNo();
				if(roll>4) {
					System.out.println("Name:-"+s.getName()+" Id:-"+s.getRollNo());
				}
			
								
				}
		
		System.out.println("Roll Numbers Between 4 and 8");
		for(Student2 s : studd) {
			int roll =s.getRollNo();
					if(roll>=4 && roll<=8 ) {
						System.out.println("Name:-"+s.getName()+" Id:-"+s.getRollNo());
					}
				
									
					}
		}
		
		
		
		
		
		
	}


