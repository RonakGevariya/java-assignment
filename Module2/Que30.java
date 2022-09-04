package Module2;

import java.util.Scanner;


class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException() 
	{
		System.out.println("Invalid Age");
	}
}

class Student
{
	int no,age;
	String name;
	String c;
	public Student(String name,int no,int age,String c) 
	{
		this.name=name;
		this.no=no;
		this.age=age;
		this.c=c;
		
		
	}
	public void check() throws AgeNotWithinRangeException 
	{
		System.out.println("Student Name Is:-"+name);
		System.out.println("Student Roll No Is:-"+no);
		
		System.out.println("Student Course Is:-"+c);
		
	
		if(!(age>15 && age<21))
		{
			throw new AgeNotWithinRangeException();
		}
		else
		{
		System.out.println("Student Age Is:-"+age);
		}
		
}
}
public class Que30 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :- ");
		String name = sc.next();
		System.out.println("Enter Roll No :- ");
		int no = sc.nextInt();
		System.out.println("Enter Age :- ");
		int age = sc.nextInt();
		System.out.println("Enter Course :-");
		String c = sc.next();
		
		Student s1 = new Student(name,no,age,c);
		try 
		{
			s1.check();
		} catch (AgeNotWithinRangeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
