public class TwoNumbers {
  public static void main(String[] args) {
    // Create a program that prints a few operations on two numbers: 22 and 13

    // Print the result of 13 added to 22

    // Print the result of 13 substracted from 22

    // Print the result of 22 multiplied by 13

    // Print the result of 22 divided by 13 (as a decimal fraction)

    // Print the integer part of 22 divided by 13

    // Print the reminder of 22 divided by 13

    int a = 22;
    int b = 13;
    double c;
    c = a / b;

    System.out.println("adding is: " + (a + b));
    System.out.println("subtracted: " + (a - b));
    System.out.println("decimal fraction: " + (22. / 13.));
    System.out.println("divided: " + (a / b));
    System.out.println("multiplied: "+(a * b));
    System.out.println("reminder: "+(a % b));
  }
}