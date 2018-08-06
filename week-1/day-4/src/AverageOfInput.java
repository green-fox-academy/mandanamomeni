// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("first");
    int number1 = scanner.nextInt();

    System.out.println("second");
    int number2 = scanner.nextInt();

    System.out.println("third");
    int number3 = scanner.nextInt();

    //System.out.println(int number1 = scanner.nextInt();

    System.out.println("The first number is:" + number1 +  "/// The second number is:"+ number2 + " ///The third number is:" + number3);


  }

}
