import java.util.Scanner;
public class Arrays {
    public static void main(String[] args)
    {
        int[] x = new int[5];
        long[][] l = new long[5][5];

        for(int i=0;i<5;i++)
        {
            for(int j=0; j<5;j++)
            {

            }
        }
        l[3][2]=25;


        Scanner s = new Scanner(System.in);
        try{
            for(int i=0; i<5; i++)
            {
                System.out.println("Please enter the number");
                x[i]=s.nextInt();
            }
        }catch(Exception e)
        {
            System.out.println("Wrong input!");
        }

        for(int i=0; i<5; i++){
            System.out.print(+x[i]+" ");
        }
        s.close();

        double[][] y = new double[3][4];

        for(int i = 0;i<3;i++)
            for(int j=0;j<4;j++)
            {
                y[i][j]=i*j;
            }

        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
    }
}
