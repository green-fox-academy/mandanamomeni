// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
public class String1 {
  public static void main(String[] args) {
    String old = "maximus";
    System.out.println(makeNew(old));

  }
  public static String makeNew(String word) {

    int x = word.indexOf('x');
    if (x == -1) {
      return word;
    } else
      word = word.substring(0, x) + "y" + word.substring(x+1);
    System.out.println(word);
    return makeNew(word);
  }
}

