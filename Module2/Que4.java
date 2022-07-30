package Module2;

public class Que4 
{
	public static void main(String[] args) 
	{
		String r1 ="Python Exercises";
		String r2 ="Python Exercise";
		String r3="se";
		
		boolean end1=r1.endsWith(r3);
		boolean end2=r2.endsWith(r3);
		
		System.out.println(r1+" ends with "+r3+ " ? "+end1);
		System.out.println(r2+" ends with "+r3+ " ? "+end2);
	}
}
