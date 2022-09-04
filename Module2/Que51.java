package Module2;

import java.util.ArrayList;
import java.util.Collections;

public class Que51 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Car");
		a1.add("Bike");
		a1.add("Rickshaw");
		a1.add("Truck");
		System.out.println("Before Reversing :- "+a1);
		
		Collections.reverse(a1);
		System.out.println("After Reversing :-  "+a1);
	}
}
