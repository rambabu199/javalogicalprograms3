//11. Write a JAVAprogram to input week number and print week day.
import java.util.Scanner;

class Week {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a week number:");
    int a = sc.nextInt();
    if (a == 1) {
      System.out.println("monday");
    } else if (a == 2) {
      System.out.println("tuesday");
    } else if (a == 3) {
      System.out.println("wednesday");
    } else if (a == 4) {
      System.out.println("thrusday");
    } else if (a == 5) {
      System.out.println("friday");
    } else if (a == 6) {
      System.out.println("saturday");
    } else if (a == 7) {
      System.out.println("sunday");
    } else {
      System.out.println("no day");
    }

  }

}