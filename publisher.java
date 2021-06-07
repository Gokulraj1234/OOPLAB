import java.util.*;
abstract class publisher
{
    static int pubid;
    static String name;
   publisher()
   {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the publisher details");
           System.out.println("Name:");
           name=sc.next();
           System.out.println("PubId:");
           pubid=sc.nextInt();

   }
}
class book extends publisher
{
    String bname;
    int bid;
    Scanner sc=new Scanner(System.in);
    book()
    {
       System.out.println("Book details:");
        System.out.println("Book name");
        bname=sc.next();
        System.out.println("Book Id");
        bid=sc.nextInt();
    }
}
class literature extends book
{
    String chapt;
    int chaptno;
    Scanner sc=new Scanner(System.in);
    literature()
    {
        System.out.println("Chapter Name:");
        chapt=sc.next();
        System.out.println("Chapter number:");
        chaptno=sc.nextInt();
    }
}
class fiction extends literature
{
    String topic;
    Scanner sc=new Scanner(System.in);
    fiction()
    {
        System.out.println("Topic");
        topic=sc.next();
    }
    void display()
    {
         System.out.println();
        System.out.println("Details are:");
        System.out.println("Publisher Name:"+name);
        System.out.println("Pblisher Id:"+pubid);
        System.out.println("Book name:"+bname);
        System.out.println("Book Id:"+bid);
        System.out.println("Chapter:"+chapt);
        System.out.println("Chapter Number"+chaptno);
        System.out.println("Topic:"+topic);
    }
}
class hirerchy {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        fiction tr[]=new fiction[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new fiction();
            tr[i].display();
        }
    }
}

==================================================================================
Output:
C:\Users\Dell\Desktop>java hirerchy
Enter the limit:
2
Enter the publisher details
Name:
JK
PubId:
111211
Book details:
Book name
Java
Book Id
111011
Chapter Name:
Introduction
Chapter number:
1
Topic
Basics

Details are:

Publisher Name:JK
Pblisher Id:111211
Book name:Java
Book Id:111011
Chapter:Introduction
Chapter Number1
Topic:Basics

Enter the publisher details
Name:
S.S
PubId:
112011
Book details:
Book name
Python
Book Id
110101
Chapter Name:
Function
Chapter number:
2
Topic
Basics

Details are:

Publisher Name:S.S
Pblisher Id:112011
Book name:Python
Book Id:110101
Chapter:Function
Chapter Number2
Topic:Basics