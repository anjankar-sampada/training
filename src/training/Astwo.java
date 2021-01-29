package training;
import java.util.*;
public class Astwo {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1,"Apurva");
		map.put(3,"Sakshi");
		map.put(2,"Bhagyashree");
		map.put(4,"Chandu");
		map.put(5,"Chetna");
		map.put(6,"Dheeru");
		map.put(7,"Apurva");
		map.put(8,"Sampada");
		
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		System.out.println("Roll No. greater Than 4:" +map.tailMap(4,false));
		
		System.out.println("Roll No. between 2 and 8:"+map.subMap(2,false,8,false));
	}
}
