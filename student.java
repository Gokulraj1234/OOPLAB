import java.util.Scanner;
interface student
{
	Scanner sc=new Scanner(System.in);
	int rollno=3;
	int mark=90;
	String name="Akhil";
	String classname="MCA";
}
class sports
{
	Scanner sc=new Scanner(System.in);
	int marks;
	void mark()
	{
		System.out.println("Enter marks out of 20:");
		marks=sc.nextInt();
	}
}
class result extends sports implements student
{
	void display()
	{
		System.out.println("Details are:");
		System.out.println("Name:"+name);
		System.out.println("Roll number:"+rollno);
		System.out.println("Class Name:"+classname);
		System.out.println("Academic Mark:"+mark);
		System.out.println("Sports Mark:"+marks);
	}
}
class studata
{
	public static void main(String[] args) 
	{
		result res=new result();
		res.mark();
		res.display();
	}
}
========================================================
Output:

C:\Users\Dell\Desktop>javac student.java

C:\Users\Dell\Desktop>java studata
Enter marks out of 20:
18
Details are:
Name:Akhil
Roll number:3
Class Name:MCA
Academic Mark:90
Sports Mark:18
