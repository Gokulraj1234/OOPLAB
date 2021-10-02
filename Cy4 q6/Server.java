import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

 class Server
 {
    public static void main(String[] args) throws Exception 
    {

        Socket sc=null;
        ServerSocket serversc=null;
        InputStreamReader inputstreamreader=null;
        OutputStreamWriter outputstreamwriter=null;
        BufferedReader bufferedreader=null;
        BufferedWriter bufferedwriter=null;
        
        serversc=new ServerSocket(1234);
        System.out.println("Server Started");
        System.out.println("Waiting..");

        while(true)
        {
            try
            {
                sc=serversc.accept();
                System.out.println("Client Connected");

                inputstreamreader=new InputStreamReader(sc.getInputStream());
                outputstreamwriter=new OutputStreamWriter(sc.getOutputStream());

                bufferedreader=new BufferedReader(inputstreamreader);
                bufferedwriter=new BufferedWriter(outputstreamwriter);

            

            while(true)
            {

                String msg=bufferedreader.readLine();
                System.out.println("Client message: "+msg);

                if(msg.equalsIgnoreCase("stop"))
                break;
            }
            System.out.println("Connection Closed");
            System.exit(0);
            sc.close();
            inputstreamreader.close();
            outputstreamwriter.close();
            bufferedreader.close();
            bufferedwriter.close();
    }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }
 }