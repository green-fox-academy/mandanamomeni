//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("pleae enter a num: ");
    int Number = scanner.nextInt();


    //int Number = 4;
    System.out.println(factorio(Number));
  }

  public static int factorio(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      //System.out.println(factorial);
      factorial = factorial * i;
    }
    return factorial;
  }
}
