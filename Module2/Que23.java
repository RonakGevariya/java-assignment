package Module2;

import java.util.Scanner;

public class Que23 
{
	public static void main(String[] args) 
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st Number :");
			int a=sc.nextInt();
			System.out.println("Enter 2nd Number :");
			int b=sc.nextInt();
			System.out.println("DIVISION  IS :"+(a/b));
			System.out.println("DONE");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
