import java.util.*;
public class product{
int pcode,price;
String pname;

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
product[] p=new product[3];
for(int i=0;i<3;i++)
{
	System.out.println("Enter the data");
	p[i]=new product();
	System.out.println("Enter pcode:");
	p[i].pcode=sc.nextInt();
	System.out.println("Enter price:");
	p[i].price=sc.nextInt();
	System.out.println("Enter pname:");
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
		