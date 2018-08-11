import java.util.*;
import java.util.ArrayList;
public class IsInList {
  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"

    checkNums(list);
    System.out.println(checkNums(list));

  }

  public static boolean checkNums(ArrayList<Integer> list) {

    if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)) {
      return (true);

    } else {
      return (false);
    }
  }

}