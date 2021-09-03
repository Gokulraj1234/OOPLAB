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
		System.out.println("Name:"+name);
		System.out.println("EmpId:"+empid);
		System.out.println("Address:"+address);
		System.out.println("Subject:"+subjects);
		System.out.println("Department"+department);
		System.out.println("Salary"+salary);
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