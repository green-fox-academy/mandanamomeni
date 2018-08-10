import java.util.HashMap;

public class lesson {
  public static void main(String[] args) {
    // function is biger than method,
    //int [] i = {mfmf};
    //int [] i = j.clone(); make a copy from i

    HashMap<String,String> eng2hunDic = new HashMap<>();
    eng2hunDic.put("Apple", "alma");
    eng2hunDic.put("pear", "sasa");
    System.out.println(eng2hunDic.get("Apple"));

    for (String word: eng2hunDic.keySet())
      System.out.println(word);
  }

}
