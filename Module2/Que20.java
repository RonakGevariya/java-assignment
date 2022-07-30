package Module2;

class Shape
{
	int length,breadth;
	int side;
	int radius;
	public void RectangleArea()
	{
		
	}
	public void SquareArea() 
	{
		
	}
	public void CircleArea() 
	{
		
	}
}

class Area1 extends Shape
{
	public void RectangleArea()
	{
		System.out.println("Area Of Rectangle :- "+(length*breadth));
	}
	public void SquareArea() 
	{
		
		System.out.println("Area Of Square :-"+(4*side));
	}
	public void CircleArea() 
	{
		
		System.out.println("Area Of Circle :- "+(3.14*radius*radius));
	}
}
public class Que20 
{
	public static void main(String[] args) 
	{
		Area1
		s1 = new Area1();
		s1.length=8;
		s1.breadth=16;
		s1.side=4;
		s1.radius=6;
		s1.RectangleArea();
		s1.SquareArea();
		s1.CircleArea();
	}
}
