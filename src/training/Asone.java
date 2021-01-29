package training;
import java.util.*;

class City{   
String name;  
int population;  
City(String name,int population ){  

this.name=name;  
this.population=population;  
}  
}  
class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
	City c1=(City)o1;  
	City c2=(City)o2;
  
return c1.name.compareTo(c2.name);  
}  
}  

class PopComparator implements Comparator<Object>{  
public int compare(Object o1,Object o2){  
City c1=(City)o1;  
City c2=(City)o2;  
  
if(c1.population==c2.population)  
return 0;  

else if(c1.population>c2.population)  
return 1;  
else  
return -1;  
}  
}  
public class Asone {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  
			ArrayList<City> al=new ArrayList<City>();  
			al.add(new City("Nagpur",10000));  
			al.add(new City("Pune",100000));  
			al.add(new City("Mumbai",1000000));  
			  
			System.out.println("Sorting by Name");  
			  
			Collections.sort(al,new NameComparator());  
			Iterator itr=al.iterator();  
			while(itr.hasNext()){  
				City cy=(City)itr.next();  
			System.out.println(cy.name+" "+cy.population);  
			}  
			  
			System.out.println("Sorting by Population");  
			  
			Collections.sort(al,new PopComparator());  
			Iterator<City> itr2=al.iterator();  
			while(itr2.hasNext()){  
				City cy=(City)itr2.next();  
			System.out.println(cy.name+" "+cy.population);  
			}  
			  
	}

}
