package Module2;

class Rectangle
{
	int length,breadth;
	public Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void area()
	{
		System.out.println(length*breadth);
	}
	public void perameter()
	{
		System.out.println(2*(length+breadth));
	}
}
class Square extends Rectangle
{
	public Square(int s)
	{
		super(s,s);
	}
}
public class Que13 
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(4, 8);
		Square s1=new Square(8);
		r1.area();
		r1.perameter();
		s1.area();
		s1.perameter();

	}
}
