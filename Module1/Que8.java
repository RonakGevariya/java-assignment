package Module1;

import java.util.Scanner;

public class Que8 
{
	public static void main(String[] args) 
	{
		long n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer number less than ten billion:-");
		n=sc.nextLong(); 
		if(n>0)
			  
			{while(n!=0)
			{
				n=n/10;
				count++;
			}
				System.out.println("THE NUMBER IS POSITIVE");
				System.out.println("COUNT OF THE NUMBER IS "+count);
			}
			else
			{
				System.out.println("THE NUMBER IS NOT POSITIVE");
			}
	}
}
