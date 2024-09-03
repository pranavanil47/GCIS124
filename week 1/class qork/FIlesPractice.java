import java.util.Scanner;
public class FIlesPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter number of strings you would like to enter :");
        int counter = s.nextInt();

        while(counter!=0)
        {
            System.out.println("Please enter a string:");
            String input = s.nextLine();
            counter--;
        }
        s.close();
    }
}
