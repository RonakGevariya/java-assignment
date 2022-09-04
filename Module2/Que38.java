package Module2;

import java.util.ArrayList;

public class Que38 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Hello");
		a1.add("Good");
		a1.add("After");
		a1.add("noon");
		System.out.println("ArrayList Is :- "+a1);
		
		a1.add(0,"gud");
		
		System.out.println("ArrayList Is :- "+a1);
	}
}
