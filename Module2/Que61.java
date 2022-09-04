package Module2;

import java.util.ArrayList;

public class Que61 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Car");
		a.add("Bike");
		a.add("Rickshaw");
		a.add("Truck");
		a.add("BIcycle");
		System.out.println("Arraylist Is :- "+a);
		
		System.out.println("Index Of Element :- ");
		int no = a.size();
		for(int i=0;i<no;i++)
		{
			System.out.println(a.get(i));
		}
	}
}
