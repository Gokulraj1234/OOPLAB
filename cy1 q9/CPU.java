import java.util.*;
class CPU 
{
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    class  processor{
        processor(double core,String manufcturer)
        {
            System.out.println("Cores:"+core);
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
    static class RAM
    {
        RAM(double memory,String manufcturer)
        {
            System.out.println("Memory:"+memory+"GB");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
}
 class cpusys
{
    public static void main(String args[])
    {
        CPU c=new CPU(20000);
        CPU.processor pr=c.new processor(3,"Intel");
        new CPU.RAM(4,"Dell");

    }
}