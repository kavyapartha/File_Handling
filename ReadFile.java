import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader filereader = new FileReader("C:\\Users\\Kavya Medharametla\\IdeaProjects\\FileHandeling\\File.text");
            Scanner scan = new Scanner(filereader);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file cannot be read");
        }

    }
}
