package Module2;

import java.util.ArrayList;
import java.util.HashSet;

public class Que56 
{
	public static void main(String[] args) 
	{
		HashSet a = new HashSet();
		a.add("Car");
		a.add("Bike");
		a.add("Rickshaw");
		a.add("Truck");
		a.add("BIcycle");
		System.out.println("Hashset Is :- "+a);
		
		String[] new_array = new String[a.size()];
	      a.toArray(new_array);
	 
	     System.out.println("Array elements: ");
	      for(String element : new_array)
	      {
	        System.out.println(element);
	      }
		
	}
}
