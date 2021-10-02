import java.util.*;
import java.io.*;
class NewFile
{
            public static void main(String args[])throws IOException
            {
                        int l=1,w=0;           
                        char c;
                        Scanner scr=new Scanner(System.in);
                        System.out.print("\nEnter File name:");
                        String str=scr.nextLine();
                        FileInputStream f=new FileInputStream(str);
                        int n=f.available();
                        for(int i=0;i<n;i++)
                        {
                                    c=(char)f.read();
                                    if(c=='\n')
                                          l++;
                                    else if(c==' ')
                                          w++;
                                                                       
                        }
                        System.out.println("\nNumber of lines in File: "+l);
                        System.out.println("Number of words in File: "+(l+w));
                        System.out.println("Number of characters in File: "+n);
                       

            }
}