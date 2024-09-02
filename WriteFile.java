import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter filewriter = new FileWriter("C:\\Users\\Kavya Medharametla\\IdeaProjects\\FileHandeling\\File.text");
            filewriter.write("Hello Veevans");
            filewriter.close();
        } catch (IOException e) {
            System.out.println("Can't Write to file");
        }

    }
}
