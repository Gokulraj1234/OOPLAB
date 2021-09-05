import java.util.Scanner;
interface Bill
{
  void Bill_det();
}
class product implements Bill 
{
  Scanner sc = new Scanner(System.in);
  int pid,quant,price,total,ord_no;
  String date,name;
   
public void Bill_det()
{
 System.out.println("\nEnter the product details:");
 System.out.println("Order number:");
 ord_no=sc.nextInt();
 System.out.println("Date:");
 date=sc.next();
 System.out.println("Product Id:");
 pid=sc.nextInt();
 System.out.println("Name:");
 name=sc.next();
 System.out.println("Quantity:");
 quant=sc.nextInt();
 System.out.println("Unit price:");
 price=sc.nextInt();
}

void display()
{ 
System.out.println("\nOrder number:"+ord_no);
System.out.println("DATE:"+date);
System.out.println("\nProductId   Name  Qty  Price Total");
System.out.println("-------------------------------------");
System.out.format("       %d    %s    %d    %d   %d \n",pid, name, quant,price,price*quant);
System.out.println("=====================================");

}
}
class Main
{ 
	public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the limit:");
 int n=sc.nextInt();
 int sum=0;
 product p[]=new product[n];
 for (int i=0;i<n;i++)
 {
   p[i]= new product();
   p[i].Bill_det();
   p[i].display();
   sum+=p[i].price*p[i].quant;
 }
 System.out.println("\nGrand Total:"+sum);
 }
}