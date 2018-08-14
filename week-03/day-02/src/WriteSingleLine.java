import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

  public class WriteSingleLine {
    public static void main(String[] args) {

      List<String> contentName = new ArrayList();
        contentName.add("First line of my file");
        contentName.add("My name is Mandana");

        try{
        Path filePath = Paths.get( "C:/reenfox/mandanamomeni/mandanamomeni/week-03/day-02/my-file.txt");
       Files.write(filePath,contentName);
      } catch (Exception e) {
        System.out.println("Unable to write file: my-file.txt");
      }
      }
    }

