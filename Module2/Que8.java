package Module2;

class PrintNumber
{
	public int print(int a)
	{
		System.out.println("Integer :"+a);
		return a;
	}
	public float print(float b)
	{
		System.out.println("Float :"+b);
		return b;
	}
	public double print(double c)
	{
		System.out.println("Double :"+c);
		return c;
	}
	public String print(String d)
	{
		System.out.println("String :"+d);
		return d;
	}
	
}
public class Que8 
{
	public static void main(String[] args) {
		PrintNumber a = new PrintNumber();
		//PrintNumber b = new PrintNumber();
		a.print(4);
		a.print(4.8);
		a.print("163");
		a.print('R');
		a.print(14.100);
	}
	
}
