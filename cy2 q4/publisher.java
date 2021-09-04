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
class Main {
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