import java.util.Scanner;

class SortString
 {
  String[] str = new String[100];
  int size;

 void get() 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit:");
    size = sc.nextInt();
    System.out.println("Enter the String:");
     for (int i=0;i< size;i++)
     {
    
      str[i] = sc.next();       
    } 
  }

 void sortstring()
  {
   for (int i = 0; i < size; i++)
   {
    for (int j = i+1; j < size; j++)
    {
     if (str[i].length() < str[j].length())
     {
       String temp = str[i];
       str[i] = str[j];
       str[j] = temp;  
      } 
    } 
  }
 }

 void sorted()
  {  
     System.out.print("-----------------------------\n");
    System.out.println("Descending Order:");
    for (int i=0;i< size;i++)
    {
     System.out.println(str[i]);  
   }
        
  for (int i = 0; i <size; i++)
  {
         for (int j = i+1; j <size; j++)
         {
          if (str[i].length() > str[j].length())
          {
           String temp = str[i];
           str[i] = str[j];
           str[j] = temp; 
         } 
       }
      } 

   System.out.println("\nAscending Order:");
    for (int i=0;i< size;i++)
    {
     System.out.println(str[i]); 
   }    
   
   }
}

class Main
{
  public static void main(String[] args) 
  {
   SortString s=new SortString();
    s.get();
    s.sortstring();
    s.sorted();
  }
}
