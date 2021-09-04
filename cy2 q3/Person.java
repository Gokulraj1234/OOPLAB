import java.util.Scanner;
class person{
    Scanner sc=new Scanner(System.in);
    String gender;
    String address;
    String name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Age:");
        age=sc.nextInt();
         System.out.println("Address:");
        address=sc.next();
         System.out.println("Gender:");
        gender=sc.next();
    }
}

class employee extends person
{
    int empid;
    int salary;
    String company_name;
    String qualification;
    Scanner sc=new Scanner(System.in);
    employee()
    {
        System.out.println("Empolyee Details");
        System.out.println("Company Name:");
        company_name=sc.next();
        System.out.println("Employee ID:");
        empid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        salary=sc.nextInt();
    }
}
class teacher extends employee
{
    Scanner sc=new Scanner(System.in);
    String dept;
    String sub;
    int techrID;
    teacher(){
        System.out.println("Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        sub=sc.next();
        System.out.println("Teahcer ID:");
        techrID= sc.nextInt();
    }
    void display()
    {
    	System.out.println(" ");
        System.out.println("Details are:");
        System.out.println(" ");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Company Name:"+company_name);
        System.out.println("EmpId:"+empid);
        System.out.println("Qualification:"+qualification);
        System.out.println("TeacherId:"+techrID);
        System.out.println("Address:"+address);
        System.out.println("Subject:"+sub);
        System.out.println("Department:"+dept);
        System.out.println("Salary:"+salary);
        System.out.println("---------------------- ");
    }
}
class persn 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].display();
        }
    }
}
