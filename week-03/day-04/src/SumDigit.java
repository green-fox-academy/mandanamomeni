public class SumDigit {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    int poweredNumber = numPower(10, 3);
    System.out.println(poweredNumber);
  }

  private static int numPower(int num, int pow) {
    if (pow == 1) {
      return num;
    } else {
      return num * numPower(num, num - 1);
    }
  }
}

