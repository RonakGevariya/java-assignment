package Module2;

class Marks
{
	public void getPercentage()
	{
		
	}
}
class St1 extends Marks
{
	int s1,s2,s3;
	public void getPercentage()
	{
		s1=s1;
		s2=s2;
		s3=s3;
		System.out.println("MATHS :- "+s1);
		System.out.println("SCIENCE :- "+s2);
		System.out.println("SANSKRIT :- "+s3);
		System.out.println("TOTAL IS :- "+(s1+s2+s3));
		System.out.println("PERCENTAGE IS :- "+(s1+s2+s3)*100/300);
		
	}
}
class St2 extends Marks
{
	int s1,s2,s3,s4;
	public void getPercentage()
	{
		s1=s1;
		s2=s2;
		s3=s3;
		s4=s4;
		System.out.println("***********************************");
		System.out.println("RUBY :- "+s1);
		System.out.println("PYTHON :- "+s2);
		System.out.println("JAVA :- "+s3);
		System.out.println("PHP :- "+s4);
		System.out.println("TOTAL IS :- "+(s1+s2+s3+s4));
		System.out.println("PERCENTAGE IS :- "+(s1+s2+s3+s4)*100/400);
	}
	
}
public class Que18 
{
	public static void main(String[] args) 
	{
		St1 a=new St1();
		a.s1=84;
		a.s2=88;
		a.s3=94;
		a.getPercentage();
		
		St2 b=new St2();
		b.s1=80;
		b.s2=86;
		b.s3=92;
		b.s4=90;
		b.getPercentage();
	}
}
