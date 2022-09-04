package Module2;

import java.util.ArrayList;

public class Que55 
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
		System.out.println("Frist ArrayList Is :- "+a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		System.out.println("Second ArrayList Is :- "+a2);
		
		ArrayList ar = new ArrayList();
		ar.addAll(a1);
		ar.addAll(a2);
		System.out.println("Join ArrayList Is :- "+ar);
		
	}
}
