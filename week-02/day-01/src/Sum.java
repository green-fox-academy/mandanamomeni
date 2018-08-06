//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("please enter the first number: ");
    int a = scanner.nextInt();

    System.out.println("please enter the second number: ");
    int b = scanner.nextInt();

    sum(a, b);

  }

  public static int sum(int i, int j) {
    int c = i + j;
    System.out.println(c);
    return (c);
  }
}
