package Module2;

class Area 
{
	public void output(int l,int b)
	{
		System.out.println("Area Of Rectangle Is :"+(l*b));
	}
	public void output(int a)
	{
		System.out.println("Area Of Square Is :"+(a*a));
	}
}
public class Que10 
{
	public static void main(String[] args) 
	{
		Area obj = new Area();
		obj.output(4,8);
		obj.output(4);
		
	}
}
