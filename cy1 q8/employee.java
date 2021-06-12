import java.util.Scanner;

public class employee 
{
	int eNo,eSalary;
	String eName;

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		employee[] e=new employee[50];
		System.out.println("Enter the no of employees:");
		int n=sc.nextInt();
		System.out.println("enter the details");
		for(int i=0;i<n;i++)
		{
			e[i]=new employee();
			System.out.println("eNo:");
			e[i].eNo=sc.nextInt();
			System.out.println("Salary:");
			e[i].eSalary=sc.nextInt();
			System.out.println("Name:");
			e[i].eName=sc.next();
		}
		System.out.println("Enter the eNo to find Employee:");
		int enmb=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(e[i].eNo==enmb)
			{
				System.out.println("Employee found");
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found:");
			}
		}


	}

}
