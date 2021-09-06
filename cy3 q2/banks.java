import java.util.*;
class Investment
{
	void intrest(double years,double amount)
	{
		double federal=(amount*years*8.4)/100;
		System.out.println("Intrest amount in Federal ="+federal);	
		double karur=(amount*years*7.3)/100;
		System.out.println("Intrest amount in Karur ="+karur);	
		double boi=(amount*years*9.7)/100;
		System.out.println("Intrest amount in BOI ="+boi);	
	}
}
class Bank
{
	public static void main(String args[])
	{
	double years,amount;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Amount:");
	amount=sc.nextLong();
	System.out.print("Enter the no: of years:");
	years=sc.nextDouble();
	Investment inv=new Investment();	
	inv.intrest(amount,years);
	}
}
 