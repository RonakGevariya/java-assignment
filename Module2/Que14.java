package Module2;

import javax.swing.text.TabableView;

class Triangle
{
	public void p(int s1,int s2, int s3)
	{
		int s;
		s=s1+s2+s3;
		System.out.println("Perimeter Is :-"+s);
	}
	public void a(int s1,int s2, int s3)
	{
		int s=(s1+s2+s3)/2;
		double area;
		area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		
		if((s1+s2)<s3 || (s1+s3)<s2 || (s2+s3)<s1)
		{
			System.out.println("Invalid Triangle");
		}
		else
		{
			System.out.println("Area Is:- "+area);
		}
	}
}
public class Que14 
{
	public static void main(String[] args) 
	{
		Triangle t = new Triangle();
		t.p(3, 4, 5);
		t.a(3,4,5);
	}
}
