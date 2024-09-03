public class HiGCIS124 
{
    public static void main(String[] args)
    {

        float x = (float)(5.0/2);
        System.out.println("Result is"+" "+x);
        String hi = "Whatever";
        System.out.println(hi.charAt(3));
        System.out.println(hi.substring(2, 5));

        int a=3;

        if(a>3 && a<15)
        {
            System.out.println("We won!");
        }
        else if(a>=15)
        {
            System.out.println("We won by far!");
        }
        else
        {
            System.out.println("We will win next time!");
        }
        a=100;
        while(a>20)
        {
            System.out.println(a);
            a=a-10;
        }

        for(double y=200;y>=5;y=y/2)
        {
            System.out.println(y);
        }

        long z = 33;
        System.out.println(z);
        float m = z;
        System.out.println(m);



    }
    //
    /*
     * acxcxa
     * axcax
     * acax
     */
    public static int add3 (int x, int y, int z)
    {
        return x+y+z;
    }

    public static double average(int x, int y, int z, int a, int b)
    {
        return (a+b+x+y+z)/5.0;
    }
}
