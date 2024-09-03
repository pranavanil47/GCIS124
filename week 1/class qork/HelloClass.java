import java.util.Scanner;

public class HelloClass {

public int x;
    public static double average(int x, int y, int z, int a, int b)
    {
        return (a+b+x+y+z)/5.0;
    }
    public static void main(String[] args)
    {
        int x=(int)floatReturn();
        System.out.println(x);
        /* 
        double y=average(3,7,8,9,5);
        System.out.println("result is "+y);

        String s = "Hello CLass!";

        String s1=s.toLowerCase();
        String s2=s.toUpperCase();
        String s3=s.substring(2,7);
        char e=s.charAt(5);
        int index=s.indexOf("o");

        System.out.println(index);
        System.out.println(s2);
        System.out.println(s1);

        double res= 5.0/2;
        System.out.println(res);*/

        if (x>3 && x<7)
        {
            System.out.println("We won!");
        }
        else if(x>7)
        {
            System.out.println("We won geatly!");
        }
        else
        {
            System.out.println("We will win next time!");
        }
        x=10;
        while(x>=5)
        {
            System.out.println(x);
            x--;
        }

        for(int z=100;z>=10;z-=10)
        {
            System.out.println(z);
        }
    }

    public static float floatReturn() {
     return 5.4f;
    }
        
}
