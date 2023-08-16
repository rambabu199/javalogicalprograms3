
//22. Write a JAVAprogram to find sum of all natural numbers between 1 to n.
import java.util.*;

class SumOfAll {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    int i = 1, sum = 0;
    while (n > 0) {
      sum = sum + i;
      i++;
      n--;
    }
    System.out.println("sum is " + sum);
  }
}