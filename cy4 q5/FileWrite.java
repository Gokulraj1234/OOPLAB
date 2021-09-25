import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileWrite

{

  public static void main(String[] args)
  {

    try {

      FileReader file1 = new FileReader("File1.txt");
      FileWriter file2 = new FileWriter("File2.txt");
      String str = "";

      int i;
      while ((i = file1.read()) != -1)
      {

        str += (char)i;
      }
      file2.write(str);
      file1.close();
      file2.close();
    }
    catch (IOException e) 
    {
      System.out.println("There are some IOException");
    }
  }
}
