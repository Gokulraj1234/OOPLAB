import java.util.*;
import java.util.Scanner;
class Main extends Thread
{
	public synchronized void run()
	{
        for(int i=0;i<10;i++)
        {
            System.out.println("India");
            try 
            {
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}

class Demo implements Runnable
{
    public synchronized void run()
	{
        for(int i=0;i<10;i++)
		{
            System.out.println("Kerala");
            try 
			{
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
public class Threads 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Main m=new Main();
		Demo d=new Demo();
		Thread t=new Thread(d);
		while(true)
		{
			System.out.println("To print India, Enter value 1");
			System.out.println("To print Kerala, Enter value 2");
			System.out.println("To Exit, Enter value 9");
			
			System.out.print("\nEnter your choice:");
			int choice = scan.nextInt();

			switch(choice)
			{
			case 1: m.start();
						try {
                    Thread.sleep(1000);
                   }
                   catch (Exception e){}
			break;
			case 2: t.start();
					try {
					m.join();
					t.join();
					}
					catch (Exception e){}
			break;
			case 9: System.out.println("Exiting");
			System.exit(0);
			default: System.out.println("Invalid Input");
			}
		}

	}

}
