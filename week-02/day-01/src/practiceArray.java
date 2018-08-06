public class practiceArray {
  // write a function that prints all the elements of the following array line by line
  // {{1,2,3}, {2,4,1}, {4,4,4}, {13,1,3215}}

  public static void main(String[] args) {
    print();
  }

  public static void print() {
    int[][] array = {{1, 2, 3}, {2, 4, 1}, {4, 4, 4}, {13, 1, 3215}};

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {

        System.out.println(array[i][j]);
      }
    }

  }

}
