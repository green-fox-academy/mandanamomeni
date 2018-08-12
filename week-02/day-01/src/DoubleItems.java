// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class DoubleItems {
  public static void main(String[] args) {
    int[] numList = {3, 4, 5, 6, 7};
    DoubleNum(numList);
  }
  public static int[] DoubleNum(int listInput[]) {
    int[] doubeledList = new int[5];
    for (int i = 0; i < listInput.length; i++) {
      doubeledList[i] = listInput[i] * 2;
      System.out.print(listInput[i] * 2 + " ");
    }
    return doubeledList;
  }
}