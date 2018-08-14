// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.*;

public class CopyFile {
  public static void main(String[] args) {


    File orginalFile = new File("C:\\Greenfox\\mandanamomeni\\mandanamomeni\\week-03\\day-02\\orginalFile.txt");
    File copiedFile = new File("C:\\Greenfox\\mandanamomeni\\mandanamomeni\\week-03\\day-02\\copiedFile.txt");
    BufferedReader reader;
    PrintWriter writer;
    String line;

    try {

      reader = new BufferedReader(new FileReader(orginalFile));
      writer = new PrintWriter(new FileWriter(copiedFile));

      while ((line = reader.readLine())  != null){

        writer.println(line);
      }
    } catch(IOException e) {
      System.out.println("no");
    }


  }
}

