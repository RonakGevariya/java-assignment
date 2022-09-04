package Module2;

import java.util.ArrayList;

public class Que41 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Hello");
		a1.add("Good");
		a1.add("Ronak");
		a1.add("After");
		a1.add("noon");
		System.out.println("ArrayList Is :- "+a1);
		
		a1.remove(2);
		
		System.out.println("Updated ArrayList Is :- "+a1);
	}
}
