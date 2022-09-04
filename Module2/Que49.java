package Module2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Que49 
{
	public static void main(String[] args) 
	{
		HashMap p1 = new HashMap();
		p1.put(1, 44);
		p1.put(2, "Rnk");
		p1.put(3.22, 'R');
		System.out.println(p1);
		
		Set set=p1.entrySet();
		Iterator i1 = set.iterator();
		while(i1.hasNext())
		{
			Map.Entry m=(Map.Entry)i1.next();
			System.out.println("Key Is :- "+m.getKey());
			System.out.println("Value Is :- "+m.getValue());
		}
	}
}
