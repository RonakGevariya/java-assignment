package Module2;

class Parent
{
	public void p()
	{
		System.out.println("This Is Parent Class");
	}
}
class Child extends Parent
{
	public void c()
	{
		System.out.println("This Is Child Class");
	}
}
public class Que11 
{
	public static void main(String[] args) 
	{
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		System.out.println("method of parent class by object of parent class :");
		obj1.p();
		System.out.println("method of child class by object of child class :");
		obj2.c();
		System.out.println("method of parent class by object of child class :");
		obj2.p();
		
	}
}
