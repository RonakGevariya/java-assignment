package Module2;

import java.util.ArrayList;

public class Que42 
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
			
			if (a1.contains("After")) 
			{
			    System.out.println("Found the element");
			}
			else
			{
			    System.out.println("There is no such element");
			}
		}

}
