import java.util.Scanner;
class complex{
	int real,img;
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	complex c=new complex();
	System.out.println("Enter first complex number:");
	c.real=sc.nextInt();
	c.img=sc.nextInt();
	System.out.println("First complex num::"+c.real+"+"+c.img+"i");
	complex c1=new complex();
	System.out.println("Enter Second complex number:");
	c1.real=sc.nextInt();
	c1.img=sc.nextInt();
	System.out.println("Second complex num:"+c1.real+"+"+c1.img+"i");
	int sreal=c1.real+c.real;
	int simg=c1.img+c.img;
	System.out.println("Sum of complex numbers:"+sreal+"+"+simg+"i");
}
}

=======================================================================
output
Enter first complex number:
12
13
First complex num::12+13i
Enter Second complex number:
15
16
Second complex num:15+16i
Sum of complex numbers:27+29i