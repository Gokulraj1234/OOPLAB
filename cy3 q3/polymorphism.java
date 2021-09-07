import java.util.Scanner;
abstract class Shape
{
abstract void draw();
abstract void erase(); 
}
class circle extends Shape
{
 void draw() 
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius:");
 int r=sc.nextInt();
 System.out.println("Area is "+3.14*r*r);
 }
 void erase()
 {
 System.out.println("Circle erased"); 
}
}
class Triangle extends Shape
{
 void draw()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the base:");
  int b=sc.nextInt();
  System.out.println("Enter the height:");
  int h=sc.nextInt();
  System.out.println("Area of triangle: " +(b*h)/2);
 }
 void erase()
 {
  System.out.println("Triangle erased"); 
  } 
}
class square extends Shape
{
 void draw()
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the side of square");
   int s=sc.nextInt();
   System.out.println("Area is " +s*s);
  }
 void erase()
  {
   System.out.println("Square erased"); 
  }
}
class Main {
    public static void main(String[] args)
    { 
       Shape c= new circle();
        c.draw();
        c.erase();
       Shape t= new Triangle();
        t.draw();
        t.erase();
       Shape s=new square();
        s.draw();
        s.erase();
    
    
     }
}