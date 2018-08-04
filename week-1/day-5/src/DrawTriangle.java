// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
import java.util.Scanner;
public class DrawTriangle {
  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("please enter a number: ");
      int userInput1 = scanner.nextInt();
      String star = "*"  ;
      for (int i = 0; i < userInput1; i++){
        System.out.println(star);
        star += "*";



        }

      }
    }


