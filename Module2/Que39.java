package Module2;

import java.util.ArrayList;

public class Que39 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Hello");
		a1.add("Good");
		a1.add("After");
		a1.add("noon");
		System.out.println("ArrayList Is :- "+a1);
		
		Object ele;
		ele = a1.get(0);
		System.out.println("First Element Is :- "+ele);
		ele = a1.get(2);
		System.out.println("Third Element Is :- "+ele);
		
	}
}
