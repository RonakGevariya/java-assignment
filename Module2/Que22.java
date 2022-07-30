package Module2;

class Shape1
{
	public void m()
	{
		System.out.println("This is this is shape");
	}
}
class Rectangle1 extends Shape1
{
	public void m1()
	{
		System.out.println("This is rectangular shape");
	}
}
class Circle1 extends Shape1
{
	public void mm2()
	{
		System.out.println("This is circular shape");
	}
}
class Square1 extends Rectangle1
{
	public void m3() 
	{
		System.out.println("Square is a rectangle");
	}
}
public class Que22 
{
	public static void main(String[] args) 
	{
		//Shape1 s1=new Shape1();
		//Rectangle1 r1=new Rectangle1();
		//Circle1 c1=new Circle1();
		Square1 s2=new Square1();
		//s1.m();
		//r1.m();
		//c1.m();
		s2.m();
		s2.m1();
	}
}
