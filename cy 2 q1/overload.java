import java.util.Scanner;
class Overload
{
 Scanner sc=new Scanner(System.in);
 int length;
 int breadth;

void read()
{
  System.out.println("Enter length and breath of rectangle:");
  length=sc.nextInt();
  breadth=sc.nextInt();
}

void area()
{
 System.out.println("Area of rectangle: "+(length*breadth));
}
void area(int a)
{
 System.out.println("Area of square: "+(a*a));
}
void area(double r)
{
 double area = 3.14*r*r;
 System.out.println("Area of the circle: "+(3.14*r*r));
}
}

class Method
{
 public static void main(String ar[])
 {
 Overload ov = new Overload();
 ov.read();
 ov.area();
 ov.area(8);
 ov.area(3.2);
 }
}