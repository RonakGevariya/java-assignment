package Module2;

class Print
{
	void Printn(int a,char c)
	{
		System.out.println("Integer Is :"+ a + " Character Is :"+c);
	}
	void Printn(char c,int a)
	{
		System.out.println("Character is :"+ c +" Integer Is :"+a);
	}
}
public class Que9 
{
	public static void main(String[] args) 
	{
		 Print obj = new Print();
		obj.Printn(8, 'R');
		obj.Printn('R', 8);
	}
}
