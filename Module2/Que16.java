package Module2;

class Parent1
{
	public void message()
	{
		
	}
}
class Sub1 extends Parent1
{
	public void message()
	{
		System.out.println("This is first subclass");
	}
}
class Sub2 extends Parent1
{
	public void message()
	{
		System.out.println("This is second subclass");
	}
}
public class Que16 
{
	public static void main(String[] args) 
	{
		Sub1 s1 = new Sub1();
		Sub2 s2 = new Sub2();
		s1.message();
		s2.message();
	}
}
