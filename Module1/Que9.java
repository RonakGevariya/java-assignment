package Module1;

public class Que9 
{
	public static void main(String[] args) 
	{
		String r = "Hello 1 2 3 check , Are You There ?? ";
		char ch[]=r.toCharArray();
		int letter=0 , space=0 , digit=0 , other=0;
		for(int i=0;i<r.length() ;i++)
		{
			//if(r.charAt(0)!=' ')
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				digit++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else 
			{
				
				other++;
			}
		}
		
		System.out.println("The String Is :"+r);
		System.out.println("Letters are :"+letter);
		System.out.println("Spaces are :"+space);
		System.out.println("Digits are :"+digit);
		System.out.println("Other :"+other);
	}
}
