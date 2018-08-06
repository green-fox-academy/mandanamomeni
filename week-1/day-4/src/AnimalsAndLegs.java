import java.util.Scanner;
public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    System.out.println("How many chicken do you have?");
    int userInput1 = scanner.nextInt();
    System.out.println("How many pig do you have?");
    int userInput2 = scanner.nextInt();
    int chickenPig = userInput1*2 + userInput2*4;

    System.out.println( "this farm has " + userInput1 * 2 + " chicken leg" );
    System.out.println( "this farm has " + userInput2 * 4 + " pig leg" );
    System.out.println("This farm can produce " + chickenPig + " leg");

  }
}