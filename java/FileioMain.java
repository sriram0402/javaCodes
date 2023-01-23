import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileioMain{
    public static void main(String[] args){
        System.out.print("hello");

        FileReader infile=new FileReader("/Users/sriram/Documents/java/javaTestFile.txt");

        BufferedReader inBuf=new BufferedReader(infile);
        String line="";

        while(line!=null){
            line=inBuf.readLine();
            System.out.println(line);

        }

        // FileWriter outFile=new FileWriter("javaTestFile.txt");
        // BufferedReader outBuf=new BufferedReader(outfile);
        // outBuf.write("data inserted in file");
    }
}