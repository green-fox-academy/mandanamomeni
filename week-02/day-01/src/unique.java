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
