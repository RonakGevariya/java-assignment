package Module2;

class Maths
{
	public void Factorial()
	{
		int n=4,fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+ n +" is "+fact);
	}
}
public class Que19 
{
	public static void main(String[] args) 
	{
		Maths m=new Maths();
		m.Factorial();
	}
}
