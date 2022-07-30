package Module2;

public class Que5 
{
	public static void main(String[] args) 
	{
		String r1 ="Red is favourite color. :";
		String r2 ="Orange is also my favourite color. :";
		String r3="Red";
		
		boolean start1=r1.startsWith(r3);
		boolean start2=r2.startsWith(r3);
		
		System.out.println(r1+" starts with "+r3+ " ? "+start1);
		System.out.println(r2+" starts with "+r3+ " ? "+start2);
	}
}
