import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class copyFileFile {
  public static void main(String[] args) {
    Path path = Paths.get("C:/Greenfox/mandanamomeni/mandanamomeni/week-03/day-02/File.txt");
    Path path1 = Paths.get("C:/Greenfox/mandanamomeni/mandanamomeni/week-03/day-02/copyFile.txt");

  }

  public static boolean fileCopy(Path path, Path path1) {
    try {
      Files.copy(path, path1);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
