// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {
  public static void main(String... args) {
    String todoText = "- Buy milk\n";

    StringBuilder todo = new StringBuilder(todoText);
    todo.insert(0, "\"My todo: \n");

    StringBuilder todo1 = new StringBuilder(todoText);
    todo.append("- Download games\n");

    StringBuilder todo2 = new StringBuilder(todoText);
    todo.append("  - Diablo\n");


    System.out.println(todo);
  }
}