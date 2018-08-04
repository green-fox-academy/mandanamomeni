import java.util.Scanner;
public class triangle2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter a number: ");
    int userInput1 = scanner.nextInt();
    String star = "*";
    String gapDown = " ";
    for(int i = 0 ; i< userInput1 ; i++){
      String gap = "";

      for (int j = 0 ; j <(userInput1-i) ; j++){
        gap = gap + " ";
      }
      System.out.println(gap + star);
      star += "**";
    }
    for (int i = userInput1-1 ; i>0 ; i--){
      String starDown = "*";
      for (int j = 0; j< userInput1-2; j++){
        starDown = starDown + "**";
      }
      gapDown = gapDown + " ";
      System.out.println(gapDown + starDown);
    }
  }
}
