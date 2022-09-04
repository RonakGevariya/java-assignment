
package Module2;

import java.util.Scanner;


class RnkException extends Exception
{
	double amount;
	public RnkException (double amount) 
	{
		this.amount= amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount) {
		balance +=amount;
		System.out.println(amount+"rs deposited");
	}
	public void withdrawal(double amount) throws RnkException
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println(amount+"rs wuthdrawal successfully");
		}
		else
		{
			double needs = amount - balance;
			throw new RnkException(needs);
		}
	}
}
public class Que29 
{
	public static void main(String[] args) throws RnkException 
	{
		ATM a1=new ATM();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount For Deposit :");
		double amount = sc.nextDouble();
		a1.deposit(amount);
		
		System.out.println("Enter Amount For Withdrawal :");
		amount = sc.nextDouble();
		
		try
		{
			a1.withdrawal(amount);
		}catch (RnkException e)
		{
			System.out.println("Sorry, insufficient balance, you need more \r\n" + 
					""+e.amount+"Rs. To perform this transaction.");
		}
	}
}
