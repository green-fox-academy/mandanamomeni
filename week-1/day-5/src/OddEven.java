import java.util.Scanner;
public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the nimber: ");
    int number1 = scanner.nextInt();

    int test = number1 %= 2;

    if ( test == 0 ){
      System.out.println(  "even");
    }
 else{
      System.out.println( "is odd");
    }

  }
}