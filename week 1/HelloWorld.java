import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Scanner;
public class HelloWorld{

    public static double  average(int x , int y, int z, int a, int b)
    {
        return (x+y+z+a+b)/5.0;
    }
    public static void main(String[] e)
    {
        
        //int result=add(7,3);
        //System.out.println("HelloWolrd"+result);
        double res = average(3,4,5,6,9);
        System.out.println("Result: "+res);

        String s = "Hi Class!";
        String m = s.toUpperCase();
        System.out.println(s);
        System.out.println(m);
        String n = s.substring(1, 6);
        System.out.println(n);

        System.out.println("Roberto".toUpperCase());
        int x=5;
        if(x<7 && x>3)
        {
            System.out.println("We win!");
        }
        else if(x>7)
        {
            System.out.println("We win by a lot!");
        }
        else
        {
            System.out.println("We will win next time!");
        }
        x=10;
        while(x>=5)
        {
            System.out.println("X is: "+x);
            x--;
        }

        for(int y=0;y<=10;y++){
            System.out.println("y: "+ y);
        }

        int counter = 1;
        double sum=0;
        Scanner scanner = new Scanner(System.in);
        while(counter<=5)
        {
            System.out.println("Please enter a number: ");
            //sum+= scanner.nextDouble();
            counter++;
        }
        System.out.println("Average is: "+sum/counter);
        scanner.close();

        int acc=sumfor(50,10);
        System.out.println(acc);

        int[] g = new int[10];

        for(int i = 0;i<10;i++)
        {
            g[i]=i*10;
            System.out.println(g[i]);
        }

        int[][] f = new int[5][6];

        for(int i=0; i<5;i++)
            for(int j=0; j<6;j++)
                f[i][j]=i+j;
            

        for(int i=0; i<5;i++)
        {
            for(int j=0; j<6;j++)
            {
                System.out.print( f[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int sumfor(int stop, int step)
    {
        int sum=0;
        for(int i =0; i<=stop; i+=step)
        {
            System.out.println(i);
            sum=sum+i;//sum+=i;
        }
        return sum;
    }

}
