// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter a number :");

    int divisor = scanner.nextInt();
    dividerResult(divisor);
  }

  public static void dividerResult(int input) {

    try {

      int result = 10 / input;
      System.out.println(result);

    } catch (ArithmeticException e) {
      System.out.println("fail");
    }

  }

}
