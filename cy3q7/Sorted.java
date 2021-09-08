import java.util.*;

class  stringSort
{
    String[] s= new String[100];
    int len;
    void getStr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        len = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i=0;i< len;i++)
        {
            s[i] = sc.next();
        }
    }
    void strSort()
    {
        for (int i=0;i<len-1;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                if(s[i].compareTo(s[j])>0)
                {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }
    void dispStr()
    {
        System.out.println("\n---------------------");
        System.out.println("Ascending order:");
        for (int i=0;i< len;i++)
        {
            System.out.println(s[i]);
        }
        System.out.println("\nDescending order:");
        for (int i=len-1;i>=0;i--)
        {
            System.out.println(s[i]);
        }
    }
}

public class Sorted
{
    public static void main(String args[])
    {
        stringSort s = new stringSort();
        s.getStr();
        s.strSort();
        s.dispStr();
    }
}