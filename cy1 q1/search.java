import java.util.Scanner;

public class search 
	{

	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int i,n,x;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter limit:");
		n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(i=0;i<=n;i++)
		{
			a[i]=sc.nextInt();			
		}
		System.out.println("Enter element to search:");
		x=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(x==a[i])
			{
				System.out.println(x+" Element found at "+i+" position");
				break;
			}
			if(i==n)
			{
				System.out.println("Elemnt not found");
			}
		}
	}

}




