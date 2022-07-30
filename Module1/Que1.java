package Module1;

import java.util.Scanner;

public class Que1 
{
	public static void main(String[] args) 
	{
		Scanner r = new Scanner(System.in);
		int a,b,c;
		System.out.println("enter number 1:");
		a=r.nextInt();
		System.out.println("enter number 2:");
		b=r.nextInt();
		System.out.println("enter number 3:");
		c=r.nextInt();
		if(a>b)
		{
			System.out.println("A is greatest");
		}
		else if(b>c)
		{
			System.out.println("B is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
	}
}
