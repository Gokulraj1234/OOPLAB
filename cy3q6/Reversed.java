import java.util.*;
import java.util.Scanner;
class StringReverse 
{  
    public static String reverseWord(String str)
 {  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words)
    {  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    System.out.println("Reversed String: "+reverseWord.trim());  
    return reverseWord.trim();
 }  
} 

public class Reversed 
{  
public static void main(String[] args) 
   {  
        Scanner in=new Scanner(System.in);
        String str;
        StringReverse rev=new StringReverse();
        System.out.println(("Enter the String:"));
        str=in.nextLine();
        rev.reverseWord(str);    
    }  
}