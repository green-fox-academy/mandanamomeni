import java.util.Scanner;
public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner scanner = new Scanner(System.in);
    System.out.println("convert kilometer to mile: ");
    int userInput2 = scanner.nextInt();
    userInput2 *= 1.5;
    System.out.println(userInput2);
  }
}