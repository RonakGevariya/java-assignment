package Module2;

import java.util.Scanner;

class Res
{
	public void MarksGrade()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Marks :- ");
		int m=sc.nextInt();
		
		if(m>=91)
        {
            System.out.print("AA");
        }
        else if(m>=81 && m<90)
        {
           System.out.print("AB");
        } 
        else if(m>=71 && m<80)
        {
            System.out.print("BB");
        }
        else if(m>=61 && m<70)
        {
            System.out.print("BC");
        }
        else if(m>=51 && m<60)
        {
            System.out.print("CD");
        }
        else if(m>=41 && m<50)
        {
            System.out.print("BB");
        }
        else
        {
            System.out.print("FAIL");
        }
	}
}
public class Que21 
{
	public static void main(String[] args) 
	{
		Res r1= new Res();	
		r1.MarksGrade();
	}
	
}
