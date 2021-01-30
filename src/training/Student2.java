package training;

 class Student2 implements Comparable<Student2>{
	
	
	String name;
	int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student2(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public int compareTo(Student2 st){  
		if(rollNo==st.rollNo)  
		return 0;  
		else if(rollNo>st.rollNo)  
		return 1;  
		else  
		return -1;  
		}  
	}
	

