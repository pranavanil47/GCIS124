import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
public class TypingExcercise {
    public static void main (String[] args) throws IOException
    {
        String fileText = readOneLine();
        System.out.println("File text: "+fileText);

        writeToFile("Any string");

        System.out.println("Please enter the input: ");
        Scanner s = new Scanner(System.in);
        int num=0;
        try{
            num = s.nextInt();
        }catch(Exception e)
        {
            System.out.println("Input is wrong, please enter an integer type. ");
            return;
        }

        System.out.println("Square is: "+ num*num);
    }

    
    public static String readOneLine() throws IOException  
    {
        FileReader fr = new FileReader("a.txt");
        BufferedReader br = new BufferedReader(fr);
        String read="";
        String s = "";
        while(read!=null)
        {
            read=br.readLine();
            if(read!=null)
                s+= read;
        }
        br.close();
        return s;
    }

    public static void writeToFile(String s) throws IOException
    {
        FileWriter fw = new FileWriter("a.txt");
        PrintWriter pw = new PrintWriter(fw);

       
        pw.println("continuos line written");
      

        pw.flush();
        pw.close();
    }
}
