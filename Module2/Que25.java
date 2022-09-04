package Module2;

public class Que25 
{
	public static void main(String[] args) 
	{
		try
		{
			int[] a=new int[30];
			//int[] a= {30};
			try
			{
				int i=a[30]/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Not Divided By Zero");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index Number Does Not Exists");
		}
	}
}
