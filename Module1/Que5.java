package Module1;

import java.util.Scanner;

public class Que5 
{
	public static void main(String[] args) 
	{
		int a,b,c,d,e;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:-");
		a=sc.nextInt();
		System.out.println("Enter Second Number:-");
		b=sc.nextInt();
		System.out.println("Enter Third Number:-");
		c=sc.nextInt();
		System.out.println("Enter Fourth Number:-");
		d=sc.nextInt();
		System.out.println("Enter Five Number:-");
		e=sc.nextInt();
		
		System.out.println("Sum Is :-"+(a+b+c+d+e));
		System.out.println("Average Is :-"+(a+b+c+d+e)/5.0);
	}
}
