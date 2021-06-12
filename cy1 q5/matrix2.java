import java.util.Scanner;

class matrix2{
    Scanner sc = new Scanner(System.in);
    int i,j,n,m;
    void rowcolm() {
        System.out.println("Enter Row and column");
        n = sc.nextInt();
        m = sc.nextInt();
    }
    int a[][] = new int[50][50];
    void get() {
        System.out.println("Enter row and column:");
        for(i=0;i<n;i++) 
        {
            for(j=0;j<m;j++) 
            {
                a[i][j]=sc.nextInt();

            }
        }

    }
    void check()
    {
        int p=2;
        for (i=0;i<n;i++) 
        {
            for(j=0;j<m;j++) 
            {
                if(a[i][j]==a[j][i])
                {
                    p=0;
                    break;

                } 
                else
                {
                    p=1;
                    break;
                }
            }
        }
        if(p==0)
        {
            System.out.println("Matrix is symmatric");
        }
        else
            System.out.println("Matrix is not symmatric");

    }
}

class symmetric {
    public static void main(String args[])
    {
        matrix2 m=new matrix2();
        m.rowcolm();
        m.get();
        m.check();
    }
}
