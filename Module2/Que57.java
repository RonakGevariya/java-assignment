package Module2;


import java.util.ArrayList;
import java.util.HashSet;

public class Que57 
{
	public static void main(String[] args) 
	{
		HashSet a = new HashSet();
		a.add("Car");
		a.add("Bike");
		a.add("Rickshaw");
		a.add("Truck");
		a.add("BIcycle");
		System.out.println("HashSet Is :- "+a);
		
		ArrayList ar = new ArrayList(a);
		
		System.out.println("Arraylist :- "+ar);

	}
		
}
