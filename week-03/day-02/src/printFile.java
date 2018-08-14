import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
public class printFile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    File okey = new File("day-02.iml");
    Scanner anotherSccaner = null;
    try {
      anotherSccaner = new Scanner(okey);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    while (anotherSccaner.hasNext()) {
      System.out.println(anotherSccaner.nextLine());
    }
  }
}
