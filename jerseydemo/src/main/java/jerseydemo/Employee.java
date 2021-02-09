package jerseydemo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement(name="employee")
public class Employee implements Serializable {

	Integer id;
	String name,dept;
	
	public Employee() {
		
	}
	public Employee(Integer id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}
	
	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	@XmlElement
	public void setDept(String dept) {
		this.dept = dept;
	}
}

