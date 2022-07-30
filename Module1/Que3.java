package Module1;

import java.util.Scanner;

public class Que3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter Year :-");
		a=sc.nextInt();
		
		if(a%4==0)
		{
			System.out.println("LEAP YEAR");
		}
		else
		{
			System.out.println("NOT LEAP YEAR");
		}
	}
}
