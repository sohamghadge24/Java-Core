import java.io.*;
// I have used the PrintWriter class to print the details of the employee
import java.io.PrintWriter;
class FileHandlingExample{
    public static void main(String[] args) throws IOException {
        File file = new File("emp.txt");
        if(file.exists()){
            file.createNewFile();
        }
        PrintWriter p1 = new PrintWriter(file);
        p1.println("Employee name: - Kaustubh");
        p1.println("Employee id: - 69");
        p1.println("Employee salary - 6900");
        p1.close();
        p1.close();
        System.out.println("Done");
        
    }
}