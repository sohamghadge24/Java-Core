import java.io.File;
import java.io.IOException;
// I have used the PrintWriter class to print the details of the employee
import java.io.PrintWriter;
class FileHandlingExample{  
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        if(file.exists()){
            file.createNewFile();
        }
        PrintWriter p1 = new PrintWriter(file);
        p1.println("Hello Sir");
        p1.close();
        p1.close();
        System.out.println("Done");
    }
}