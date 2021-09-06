import java.util.*;
abstract class shape
{
  int length,breadth;
  Scanner sc = new Scanner(System.in);
abstract void printArea();
}
class Rectangle extends shape
{
void printArea()
{
System.out.println("Enter length and breadth");
length = sc.nextInt();
breadth = sc.nextInt();
System.out.println("Area of rectangle:"+(length*breadth));
}
}
class Triangle extends shape
{
void printArea()
{
System.out.println("Enter base and height:");
length = sc.nextInt();
breadth = sc.nextInt();
System.out.println("Area of triangle:"+(length*breadth)/2);
}
}
class Circle extends shape
{
void printArea()
{
System.out.println("Enter the radius:");
length = sc.nextInt();
System.out.println("Area of Circle:"+((3.14f)*length*length));
}
}
public class shapes
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.printArea();
Triangle t=new Triangle();
t.printArea();
Circle c=new Circle();
c.printArea();
}
}