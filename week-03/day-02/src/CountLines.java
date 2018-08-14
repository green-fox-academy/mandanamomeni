import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

 public class CountLines{
public static void main(String[] args) {

  LineNumberReader reader = null;

  try {

    reader = new LineNumberReader(new FileReader(new File("day-02.iml")));
    // Read file till the end

    while ((reader.readLine()) != null) ;

    System.out.println("Count of lines - " + reader.getLineNumber());

  } catch (Exception ex) {

    ex.printStackTrace();

  }
    }
  }


