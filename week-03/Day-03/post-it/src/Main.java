public class Main {
  public static void main(String[] args) {

    PostIt postIt = new PostIt();
    postIt.backgroundColor = "Orange";
    postIt.textColor = "Blue";
    postIt.text = "Idea 1";

    PostIt postIt1 = new PostIt();
    postIt1.backgroundColor = "pink";
    postIt1.textColor = "black";
    postIt1.text = "Awesome";
    postIt1.text = "Awesome";

    PostIt postIt2 = new PostIt();
    postIt2.backgroundColor = "yellow";
    postIt2.textColor = "green";
    postIt2.text = "Superb!";

    System.out.println(postIt.backgroundColor);
  }
}
