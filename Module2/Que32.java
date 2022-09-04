package Module2;

class Ext extends Thread
{
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("Thread Done");
			i++;
		}
	}
	
}
public class Que32 
{
	public static void main(String[] args) 
	{
		Ext e1 = new Ext();
		e1.run();
	}
}
