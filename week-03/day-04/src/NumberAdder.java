// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
  public static void main(String[] args) {

    int sumNums = sumNumsRec(3);
    System.out.println(sumNums);

  }

  public static int sumNumsRec(int n) {

    if (n == 1) {
      return 1;
    } else {
      return n + sumNumsRec(n - 1);
    }

  }

}

