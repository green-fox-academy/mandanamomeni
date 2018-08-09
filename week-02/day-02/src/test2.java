import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(90);
    list.add(100);
    list.add(30);
    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      int newInt = list.get(i) + 2;
      list.set(i, newInt);
      // list.set(i, list.get(i) + 2);
    }
    System.out.println(list);

//    int[] x = new int[5];
//    System.out.println();
//
//    ArrayList<Integer> list2 = new ArrayList<>(5);
//
//    ArrayList<Integer> listWithElements = new ArrayList<>(Arrays.asList(5, 6, 9876));
//    System.out.println(listWithElements);
//
//
//    listWithElements.addAll(list);
//
//    System.out.println(listWithElements);
//
//
////    String [] listWithElement3 = new String [ listWithElement3.size()];
////     ArrayList<Integer> listWithElement3= new ArrayList<>(Arrays.asList(3,4,5));
////    System.out.println(listWithElement3);
//
//
//    System.out.println(listWithElements.isEmpty());
//    System.out.println(listWithElements.containsAll(Arrays.asList(5, 6)));
//
//    listWithElements.clear();
//    System.out.println(listWithElements.isEmpty());
//

  }
}
