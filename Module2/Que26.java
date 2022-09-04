package Module2;

import java.util.Scanner;

public class Que26 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 1st Number :- ");
		a=sc.nextInt();
		System.out.println("Enter 2nd Number :- ");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Ans is :- "+c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			
		}
	}
}
