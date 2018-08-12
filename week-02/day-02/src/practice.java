public class practice {
  public static void main(String[] args) {
    int matrix [][] = { {1,2,3},{4,5,6},{7,8,9}};
    System.out.println(reversMat(matrix));
  }

  public static int [][] reversMat ( int input [][]){
   int reversedmartix[][] = new int[][]{};

   for(int i = 0 ; i < input.length; i++){
     int counter = 0;
     for ( int j = input[i].length-1 ; j >=0 ; j--){
       reversedmartix [i][counter] = input[i][j];
       counter += 1;
     }
   }
return reversedmartix;
  }
}
