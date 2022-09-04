package Module2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Que50 
{
	public static void main(String[] args) 
	{
		HashMap p1 = new HashMap();
		p1.put(1, 44);
		p1.put("hey", "Rnk");
		p1.put("R", 'R');
		p1.put(4.44, 1);
		System.out.println(p1);
		System.out.println("Size Is :- "+p1.size());
		System.out.println(p1.keySet());
		System.out.println(p1.values());
		System.out.println(p1.keySet().size());
		System.out.println(p1.values().size());
	}
}
