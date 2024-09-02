import java.io.File;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Kavya Medharametla\\IdeaProjects\\FileHandeling\\File.text");
        try{
            if(file.exists()){
                System.out.println("File Name : " + file.getName());
                System.out.println("File path : " + file.getAbsolutePath());
                System.out.println("File length : " + file.length());
                System.out.println("File can be writable : " + file.canWrite());
                System.out.println("File can be readable : " + file.canRead());
            }
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }

    }
}
