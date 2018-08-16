// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {
  public static void main(String[] args) {
int result = bunnyEarsCount(10);
    System.out.println(result);

  }

  public static int bunnyEarsCount(int bunny){
    int ear = 2;
    if ( bunny == 1){
      return ear;
    }else{

      return ear + bunnyEarsCount(bunny-1);
    }


  }
}
