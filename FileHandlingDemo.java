import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class FileHandlingDemo {
    public static void main(String[] args) {
        String fileName="sample.txt";
        // writing data into the file
        try{
            FileWriter writer=new FileWriter(fileName);
            writer.write("Hello world!\n");
            writer.write("this is java file handling example.\n");
            writer.write("Using FileWriter and file reader.");
            writer.close();
        System.out.println("Data written successfully.");
        }
        catch(IOException e){
            System.out.println("Error while writing to file:"+e.getMessage());
        }
        // Reading data from file
        try{
            FileReader reader=new FileReader(fileName);
            int ch;
            System.out.println("\nContents of the file:");
            while((ch=reader.read())!=-1)
            System.out.print((char)ch);
        reader.close();
        }
        catch(IOException e){
            System.out.println("error while reading from file:"+e.getMessage());
        }
    }
}
