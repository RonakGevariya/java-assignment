package Module2;

import java.util.ArrayList;
import java.util.Iterator;

public class Que37 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Hello");
		a1.add("Good");
		a1.add("After");
		a1.add("noon");
		System.out.println("ArrayList Is :- "+a1);
		
		System.out.println("Iterating over the arraylist :- ");
		Iterator i1 = a1.iterator();
		{
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
		}
	}
}
