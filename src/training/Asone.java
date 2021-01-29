package training;
import java.util.*;
public class Asone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeMap<String,Integer> map=new TreeMap<String,Integer>();
			map.put("Nagpur",2000);
			map.put("Amravati",1000);
			map.put("Akola",500);
			
			for(Map.Entry m:map.entrySet())  
		      {  
		          System.out.println(m.getKey()+" "+m.getValue());      
		      }  
			
			 System.out.println("descendingMap: "+map.descendingMap());  
	}

}
