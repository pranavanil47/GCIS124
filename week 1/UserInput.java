import java.util.Scanner;
public class UserInput {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter some string: ");
        String usersInput=s.nextLine();
        System.out.println("Output: "+usersInput);

        System.out.println("please enter 2 numbers: ");
        int x=s.nextInt();
        int d=s.nextInt();

        double result = (double)x/d;
        System.out.println(result);

        s.close();


    }   
}
