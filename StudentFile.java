import java.io.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            
            FileWriter writer = new FileWriter("student.txt");

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            writer.write("Roll Number: " + rollNo + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Marks: " + marks + "\n");

            writer.close();

            System.out.println("\nStudent details saved successfully!");

            
            System.out.println("\nContents of student.txt:");

            BufferedReader reader =
                    new BufferedReader(new FileReader("student.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}
