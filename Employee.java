import java.util.Scanner;
class Employee
{
	Scanner sc=new Scanner(System.in);
	int empid;
	String name;
	int salary;
	String address;
    Employee()
	{  
		System.out.println("Enter the empid name salary address ");
		empid=sc.nextInt();
		name=sc.next();
		salary=sc.nextInt();
		address=sc.next();
	}
}
class teacher extends Employee
{ 
	Scanner sc=new Scanner(System.in);
	String department;
	String subjects;

	teacher()
	{
		System.out.println("Enter department subject taught");
		department=sc.next();
		subjects=sc.next();
	}
	void display()
	{
		System.out.println("The detais are:");
		System.out.println(name);
		System.out.println(empid);
		System.out.println(address);
		System.out.println(subjects);
		System.out.println(department);
		System.out.println(salary);
	}
}
 class employees
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		teacher tr[]=new teacher[n];
		for(int i=0;i<n;i++)
		{
			tr[i]=new teacher();
			tr[i].display();
		}

	}	
}

===================================================
Output:

C:\Users\Dell\Desktop>javac Employee.java

C:\Users\Dell\Desktop>java employees
Enter the limit:
2
Enter the empid name salary address
1011
Gokul
20000
ABH HOUSE
Enter department subject taught
BCA
C
The detais are:
Gokul
1011
ABH
C
BCA
20000
Enter the empid name salary address
1121
Rahul
20000
ABC HOUSE
Enter department subject taught
MCA
java
The detais are:
Rahul
1121
ABC
java
MCA
20000
