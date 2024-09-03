import java.util.Scanner;
public class Caller {
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Please enter something");
       String newInput = s.nextLine();
       System.out.println("Output: "+newInput);

       int x =s.nextInt();
       double y=s.nextDouble();
       long z = s.nextLong();

        //Static call
        //double res2=HelloClass.average(5, 8, 7, 7, 9);
        //System.out.println(res2);


       
    }
}
