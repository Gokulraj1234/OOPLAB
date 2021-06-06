import java.util.Scanner;
class Areas
{
	Scanner sc=new Scanner(System.in);
	int len;
	int breadth;
	int height;
	void measure()
	{
		System.out.println("Enter length,breadth ");
		len=sc.nextInt();
		breadth=sc.nextInt();
	}
	void area()
	{
		System.out.println("Area of rectangle:"+(len*breadth));
	}
	void area(int breadth,int height)
	{
		System.out.println("Area of triangle:"+(0.5*(breadth*height)));
	}	
	public static void main(String[] args) 
	{
		Areas a1=new Areas();
		a1.measure();
		a1.area();
		a1.area(6,12);		
	}
}
====================================================
Output:
C:\Users\Dell\Desktop>javac Areas.java

C:\Users\Dell\Desktop>java Areas
Enter length,breadth
12
14
Area of rectangle:168
Area of triangle:36.0