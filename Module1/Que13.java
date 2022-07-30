package Module1;

public class Que13 
{
	public static void main(String[] args) 
	{
		System.out.println("Divided By 3:");
		for (int i=1;i<100;i++)
		{
			if(i%3==0)
			
				System.out.print(i+" ");
			
		}
		
		System.out.println("\nDivided By 5:");
		for (int i=1;i<100;i++)
		{
			if(i%5==0)
			
				System.out.print(i+" ");
			
		}
		
		System.out.println("\nDivided By 3 and 5:");
		for (int i=1;i<100;i++)
		{
			if(i%3==0 && i%5==0)
			
				System.out.print(i+" , ");
			
		}
		System.out.println("\n");
	}
}
