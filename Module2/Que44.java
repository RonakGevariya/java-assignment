package Module2;

import java.util.ArrayList;
import java.util.Collections;

public class Que44 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Hello");
		a1.add("Good");
		a1.add("Ronak");
		a1.add("After");
		a1.add("noon");
		System.out.println("First ArrayList Is :- "+a1);
		
		ArrayList a2 = new ArrayList();
		a2.add("Hell");
		a2.add("Red Bull");
		a2.add("King Fisher");
		a2.add("Monster");
		a2.add("Sting");
		System.out.println("Second ArrayList Is :- "+a2);
		
		Collections.copy(a1, a2);
		System.out.println(a1);
		System.out.println(a2);
	}
	
}
