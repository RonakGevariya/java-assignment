package Module2;

import java.util.Scanner;

public class Que27 
{
	public static void main(String[] args) {
		
	
	try
	{
	Scanner sc = new Scanner(System.in);
	int a;
	System.out.println("Enter Number :- ");
	a=sc.nextInt();
	if(a>=10 && a<=40)
	{
		System.out.println(a);
	}
	
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	}
}
