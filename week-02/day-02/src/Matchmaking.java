import java.util.ArrayList;
import java.util.Arrays;

// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...
public class Matchmaking {
  public static void main(String[] args) {

    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    System.out.println(MakingMatches(girls, boys));
  }
  public static ArrayList MakingMatches(ArrayList girls, ArrayList boys) {
    ArrayList<String> newList = new ArrayList<>();
    for (int i = 0; i < girls.size(); i++) {
      newList.add(girls.get(i).toString());
      newList.add(boys.get(i).toString());
    }
    return newList;
  }
}