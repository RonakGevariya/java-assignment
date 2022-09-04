package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que52 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Car");
		a.add("Bike");
		a.add("Rickshaw");
		a.add("Truck");
		a.add("BIcycle");
		System.out.println("Arraylist Is :- "+a);
		 
		List a2 = a.subList(0, 3);
		System.out.println("Extract arraylist is :- "+a2);
	}
}
