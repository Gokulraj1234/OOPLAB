import java.util.Scanner;
public class product{
int pcode,price;
String pname;

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
product p[]=new product[4];
for(int i=0;i<4;i++)
{
	System.out.println("Enter the data:");
	p[i]=new product();
	p[i].pcode=sc.nextInt();
	p[i].price=sc.nextInt();
	p[i].pname=sc.next();
}

if(p[0].price<p[1].price)
{
	if(p[0].price<p[2].price)
	System.out.println(p[0].price+" is smallest price");
	else
	System.out.println(p[1].price+" is smallest price");
}
else if(p[1].price<p[2].price)
System.out.println(p[1].price+" is smallest price");
else
System.out.println(p[2].price+" is smallest price");
}	
}	


======================================================
Output:
Enter the data:
112
300
Book
Enter the data:
121
200
Box
Enter the data:
133
250
Bag
200 is smallest price
		