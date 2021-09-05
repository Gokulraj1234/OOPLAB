import java.util.*;
interface Student
{
int regno=100;
String name= "Gokul",course="MCA";
}

class Sports
{
String item;
float mark;

void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Item");
item=sc.next();
System.out.println("Enter the Mark");
mark=sc.nextFloat();
	
}
}

class Result extends Sports implements Student
{
	void display()
	{
	System.out.println("\nStudent details\n");
	System.out.println("RegNo:"+regno);
	System.out.println("Name:"+name);
	System.out.println("Course:"+course);
	System.out.println("Item:"+item);
	System.out.println("Mark:"+mark);
	}
	
}

public class StudentDetails
{
	
	public static void main(String args[])
	
	{
		Result res=new Result();
		res.read();
		res.display();
		
	}
}