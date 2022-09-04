package Module2;

class Sleeper extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class Que33 
{
	public static void main(String[] args) 
	{
		Sleeper s1 = new Sleeper();
		Sleeper s2 =  new Sleeper();
		s1.start();
		s2.start();
		
	}
}
