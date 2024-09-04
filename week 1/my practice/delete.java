
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class delete {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        PrintWriter pw = new PrintWriter(fw);

        pw.print("first line");
        pw.close();
    }
}
