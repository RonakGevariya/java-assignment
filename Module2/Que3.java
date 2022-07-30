package Module2;

public class Que3 
{
	public static void main(String[] args) 
	{
		String r1="topsint.in",r2="TOPSINT.IN";
		CharSequence r3="topsint.in";
		System.out.println("Comparing "+r1+" and "+r3+":"+r1.contentEquals(r3));
		System.out.println("Comparing "+r2+" and "+r3+":"+r2.contentEquals(r3));
	}
}
