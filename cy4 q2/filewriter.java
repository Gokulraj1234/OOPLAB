import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class ReadWrite 
{

	public static void main(String[] args)
	{

		try {

			FileWriter fwrite = new FileWriter("writingfile.txt");
			fwrite.write("Kerala in the South-Western region of India is often referred to as God own country.\n");
			fwrite.write("This beautiful land is rightly called the paradise.\n");
			fwrite.write("Blessed with natural beauty and ecological diversity.\n");
			fwrite.write("Kerala has a lot to offer to tourists and travelers.");
		    fwrite.close();
			FileReader fread = new FileReader("writingfile.txt");
			String str="";
            int i;
			while ((i=fread.read())!=-1)
	        {
              str+=(char)i;
            }
            System.out.println(str);
            fread.close();

		}

		catch (IOException e) 
		{

			System.out.println("There are some IOException");
		}
	}
}
