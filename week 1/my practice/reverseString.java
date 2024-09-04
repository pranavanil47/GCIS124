
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Please write a name to reverse");
        String name = inputUser.nextLine();
        System.out.println("Hello there "+ name);
        inputUser.close();

        String reverse = "";

        int counter = name.length() -1;

        while(counter>-1){
            char a = name.charAt(counter);
            reverse = reverse + a;
            counter--;


        }

        System.out.println(reverse);
    }
}
