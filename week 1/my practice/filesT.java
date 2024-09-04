
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class filesT {
    public static void main(String[] args) throws IOException {

        Scanner userInp = new Scanner(System.in);
        String nameDob = "start";
        String[] nameArrays = new String[2];




        
        while(nameDob!="" || nameDob =="exit"){ 
            System.out.println("Enter name and date of birth");
            nameDob = userInp.nextLine();
            String[] sliced = nameDob.split(" ");
            nameArrays[0]
            

        }
        userInp.close();
        

    }

    public static void fileWriteIn(String a) throws IOException{
        FileWriter fw = new FileWriter("name.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.print(a);
        pw.close();
        

    }
}
