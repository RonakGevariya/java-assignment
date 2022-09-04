package Module2;

import java.util.ArrayList;
import java.util.Collections;

public class Que54 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		System.out.println("ArrayList Is :- "+a1);
		
		Collections.swap(a1, 3, 1);
		System.out.println("After Swapping ArrayList Is :- "+a1);
	}
}
