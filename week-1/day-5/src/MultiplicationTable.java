import java.util.Scanner;
public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("plese enter the number: ");
    int number = scanner.nextInt();



    for(int i = 1; i < 11; i++){
      System.out.println(i + "*" + number + "=" + (i*number));

    }
  }
}
