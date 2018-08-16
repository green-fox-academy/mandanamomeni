// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
public class Bunny2 {
  public static void main(String[] args) {

    int countBynny = bannyEarCount(2);
    System.out.println(countBynny);
  }

  public static int bannyEarCount(int banny) {
    int earBunny = 2;
    if (banny == 1) {
      return earBunny;
    } else {
      if (banny % 2 == 0) {
        return 1 + earBunny + bannyEarCount(banny - 1);
      } else {
        return earBunny + bannyEarCount(banny - 1);
      }
    }
  }
}
