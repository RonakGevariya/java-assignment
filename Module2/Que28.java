package Module2;

import java.util.Scanner;

public class Que28 
{
	public static void main(String[] args) 
	{
		try
		{
			int age =0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Age :- ");
			age=sc.nextInt();
			
			if(age<18)
			{
				throw new ArithmeticException("Entered Age Is Not Valid");
			}
			else
			{
				System.out.println("You Are Eligible For Voting");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
