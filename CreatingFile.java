import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Kavya Medharametla\\IdeaProjects\\FileHandeling\\File.text");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully" + file.getName());
            }
            else{
                System.out.println("File already present in this path");
            }
        } catch (IOException e) {
            System.out.println("Unexpected Error");
        }


    }
}
