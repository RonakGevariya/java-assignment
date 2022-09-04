package Module2;

import java.util.ArrayList;
import java.util.Collections;

public class Que43 
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
		
		Collections.sort(a1);
		
		System.out.println("Shorted ArrayList Is :- "+a1);
	}
}
