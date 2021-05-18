import java.util.Scanner;

public class employee 
{
	int eNo,eSalary;
	String eName;

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		employee[] e=new employee[5];
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		System.out.println("enter" +n+ "details");
		for(int i=0;i<n;i++)
		{
			e[i]=new employee();
			e[i].eNo=sc.nextInt();
			e[i].eSalary=sc.nextInt();
			e[i].eName=sc.next();
		}
		System.out.println("Enter the eNo:");
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

==========================================================================
Output:
Enter the limit
3
enter3details
1111
10000
Akhil
1211
20000
Adhil
3331
25000
Aravind
Enter the eNo:
1211
Employee found