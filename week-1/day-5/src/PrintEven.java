public class PrintEven {
  // Create a program that prints all the even numbers between 0 and 500
  public static void main(String[] args) {
    for ( int i = 0; i <= 500; i++) {
      //boolean even = i % 2 ==0;
      if( i % 2 == 0) {
        System.out.println( i );

      }

    }
  }
}