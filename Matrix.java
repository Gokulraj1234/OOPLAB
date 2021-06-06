import java.util.Scanner;
class Matrix
{ 
	int a[][]=new int[5][5];
   int r,c;
   Matrix(int r,int c)
   {
     this.r=r;
     this.c=c;
	}  
	void read()
	{
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
	 	for(int i=0;i<r;i++)
	  	for(int j=0;j<c;j++)
	    a[i][j]=sc.nextInt();
	}
	
	void add(Matrix M2,Matrix M4)
	{
		 for(int i=0;i<r;i++)
			 for(int j=0;j<c;j++)
				  M4.a[i][j]=a[i][j]+M2.a[i][j];			  
	}
  void display()
   {   
   	for(int i=0;i<r;i++)
	 {
		for(int j=0;j<c;j++)
     System.out.print(a[i][j]+"    ");
	 System.out.println();
}
System.out.println();
}
public static void main(String a[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows and  columns of first matrix");
	int r=sc.nextInt();
    int c=sc.nextInt();
    Matrix M1=new Matrix(r,c);
	M1.read();
	M1.display();
	System.out.println("Enter rows and  columns of Second matrix");
	 r=sc.nextInt();
     c=sc.nextInt();
	 Matrix M2=new Matrix(r,c);
	 M2.read();
	 M2.display();
	 Matrix m4=new Matrix(r,c);
	 M1.add(M2,m4);
	 System.out.println("The matrix after addition:");
	 m4.display();
}
}
==============================================================
Output:
C:\Users\Dell\Desktop>javac Matrix.java

C:\Users\Dell\Desktop>java Matrix
Enter rows and  columns of first matrix
2
2
Enter the elements
1

2
3
4
1    2
3    4

Enter rows and  columns of Second matrix
2
2
Enter the elements
4
5
6
7
4    5
6    7

The matrix after addition:
5    7
9    11
