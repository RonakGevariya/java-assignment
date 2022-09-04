package Module2;

import java.util.HashMap;

public class Que58 
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();
		h1.put(1, "Red");
		h1.put(2, "Green");
		h1.put(3, "Black");
		h1.put(4, "White");
		h1.put(5, "Blue");

		boolean res = h1.isEmpty();
		System.out.println("Is hash map empty: " + res);
		  
		  h1.clear();
		  res = h1.isEmpty();
		  
		  System.out.println("Is hash map empty: " + res);

	}
}
