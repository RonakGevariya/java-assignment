package Module2;

import java.util.ArrayList;

public class Que62 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Car");
		a.add("Bike");
		a.add("Rickshaw");
		a.add("Truck");
		a.add("BIcycle");
		System.out.println("First Arraylist Is :- "+a);
		
		ArrayList a1 = new ArrayList();
		a1.add("Car");
		a1.add("Bike");
		a1.add("Rick");
		a1.add("Truck");
		a1.add("cycle");
		System.out.println("Second Arraylist Is :- "+a1);
		
		a.retainAll(a1);
        System.out.println("HashSet content :- "+a);
	}
}
