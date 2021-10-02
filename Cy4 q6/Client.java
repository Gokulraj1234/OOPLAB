import java.io.*;
import java.net.Socket;
import java.util.Scanner;
 class Client
 {
    public static void main(String[] args) 
    {

        Socket sock1=null;
        InputStreamReader inputstreamreader=null;
        OutputStreamWriter outputstreamwriter=null;
        BufferedReader bufferedreader=null;
        BufferedWriter bufferedwriter=null;

        try
        {
            sock1=new Socket("localhost",1234);

            inputstreamreader=new InputStreamReader(sock1.getInputStream());
            outputstreamwriter=new OutputStreamWriter(sock1.getOutputStream());

            bufferedreader=new BufferedReader(inputstreamreader);
            bufferedwriter=new BufferedWriter(outputstreamwriter);

            Scanner sc=new Scanner(System.in);

            while(true)
            {
                System.out.print("Enter the message: ");
                String msg=sc.nextLine();

                bufferedwriter.write(msg);
                bufferedwriter.newLine();
                bufferedwriter.flush();

              

                if(msg.equalsIgnoreCase("Stop"))
                    break;
               }
           }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    try{
                        if(sock1!=null)
                            sock1.close();
                        if(inputstreamreader!=null)
                            inputstreamreader.close();
                        if(outputstreamwriter!=null)
                            outputstreamwriter.close();
                        if(bufferedreader!=null)
                            bufferedreader.close();
                        if(bufferedwriter!=null)
                            bufferedwriter.close();
                    }
                    catch(IOException e)
                    {
                    e.printStackTrace();
                }
                }
            }
        }