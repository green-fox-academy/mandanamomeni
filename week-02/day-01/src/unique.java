
//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
//System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`

public class unique {
  public static void main(String[] args) {
    print(new int[]{1, 11, 34, 11, 52, 61, 1, 34});
  }

  public static void print(int n[]) {
    for (int i = 0; i < n.length; i++) {
      boolean check = true;
      for (int j = 0; j < n.length; j++) {
        if (j != i && n[i] == n[j]) {
          check = false;
        }
      }
      if (check) {
        System.out.println(n[i]);
      }
    }
  }
}
