package Module2;
class Runable implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("Thread Has Ended");	
	}
	
}
public class Que31 
{
	public static void main(String[] args) 
	{
		Runable r = new Runable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("implementing Runnable Method");

	}
}
