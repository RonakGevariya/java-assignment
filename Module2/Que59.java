package Module2;

import java.util.ArrayList;

public class Que59 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList(5);
		a.add("Car");
		a.add("Bike");
		a.add("Rickshaw");
		a.add("Truck");
		a.add("BIcycle");
		System.out.println("Arraylist Is :- "+a);
		
		a.ensureCapacity(8);
		a.add("Activa");
		a.add("SUV");
		System.out.println("New Arraylist Is :- "+a);
	}
}
