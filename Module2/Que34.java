package Module2;

class Tt extends Thread
{
	public void run()
	{
			System.out.println("Thread Is Running");
	}
}
public class Que34 
{
	public static void main(String[] args) 
	{
		Tt t1 = new Tt();
		t1.start();
		t1.start();
	}
}
