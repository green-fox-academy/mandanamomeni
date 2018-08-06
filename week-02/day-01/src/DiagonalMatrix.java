// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class DiagonalMatrix {
  public static void main(String[] args) {

    int[][] arrayDimen = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    for (int i = 0; i < arrayDimen.length; i++) {

      for (int j = 0; j < arrayDimen[i].length; j++) {
        if (arrayDimen[i] == arrayDimen[j]) {

          arrayDimen[i][j] += 1;
        }

        System.out.print(arrayDimen[i][j] + " ");
      }

      System.out.println();
    }

  }
}
