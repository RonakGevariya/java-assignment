package Module2;

class Bank
{
	public void getBalance()
	{
		
	}
}
class BankA
{
	public void getBalance()
	{
		System.out.println("Deposited Amount Is :- $100");
	}
}
class BankB
{
	public void getBalance()
	{
		System.out.println("Deposited Amount Is :- $150");
	}
}
class BankC
{
	public void getBalance()
	{
		System.out.println("Deposited Amount Is :- $200");
	}
}

public class Que17 
{
	public static void main(String[] args) 
	{
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		a.getBalance();
		b.getBalance();
		c.getBalance();
	}
}
