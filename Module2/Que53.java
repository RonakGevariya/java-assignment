package Module2;

import java.util.ArrayList;

public class Que53 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Car");
		a.add("Bike");
		a.add("Rickshaw");
		a.add("Truck");
		a.add("BIcycle");
		System.out.println("Firrst Arraylist Is :- "+a);
		
		ArrayList a2 = new ArrayList();
		a2.add("Car");
		a2.add("Bike");
		a2.add("Rickshaw");
		a2.add("Truck");
		a2.add("BIcycle");
		System.out.println("Second Arraylist Is :- "+a2);
		
		boolean b = a.equals(a2);
		System.out.println("Is This Same ?? "+b);
		
	}
}
