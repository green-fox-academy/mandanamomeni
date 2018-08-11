// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)
// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
////    System.out.println(quote.indexOf("It"));
////
////    String add = "always takes longer than" ;
////
////    System.out.println(quote.concat(add));
////    System.out.println(quote.substring(18,30));

    StringBuilder sb = new StringBuilder(quote);
    sb.insert(sb.indexOf(" you"), " always takes longer than");
    System.out.println(sb);
  }
}
