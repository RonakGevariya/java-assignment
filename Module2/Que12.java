package Module2;

class Member
{
	String Name;
	int age;
	String pno;
	String ad;
	double salary;
	
	public void salary()
	{
		System.out.println(salary);
	}
	
}
class emp extends Member
{
	String Name;
	int age;
	String pno;
	String ad;
	double salary;
	String specialization;
	
	public void show()
	{
		Name=Name;
		age=age;
		pno=pno;
		ad=ad;
		specialization=specialization;
	}
	
	public void display()
	{
		System.out.println("Enter Name:- "+Name);
		System.out.println("Enter Age:- "+age);
		System.out.println("Enter Phone Number:- "+pno);
		System.out.println("Enter Address:-"+ad);
		System.out.println("Enter Specialization:- "+specialization);
		System.out.println("Enter Salary:- "+salary);
	}
}
class man extends Member
{
	String Name;
	int age;
	String pno;
	String ad;
	String department;
	public void show()
	{
		Name=Name;
		age=age;
		pno=pno;
		ad=ad;
		department=department;
	}
	
	public void display()
	{
		System.out.println("***********************************");
		System.out.println("Enter Name:- "+Name);
		System.out.println("Enter Age:- "+age);
		System.out.println("Enter Phone Number:- "+pno);
		System.out.println("Enter Address:-"+ad);
		System.out.println("Enter Department:- "+department);
		System.out.println("Enter Salary:- "+salary);
	}
}
public class Que12 
{
	public static void main(String[] args) 
	{
		emp e1=new emp();
		e1.Name="Rnk";
		e1.age=19;
		e1.pno="92166516";
		e1.ad="Nikol";
		e1.specialization="Programmer";
		e1.salary=5;
		e1.show();
		e1.display();
		
		man m1 = new man();
		m1.Name="Ronko";
		m1.age=20;
		m1.pno="613956";
		m1.ad="New IC";
		m1.department="Research";
		m1.salary=10;
		m1.show();
		m1.display();
	}
}
