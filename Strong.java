//47. Write a JAVAprogram to check whether a number is Strong number or not.
import java.util.*;

class Strong {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    int sum = 0;
    int t = n;
    while ( n>0) {
      int d = n % 10;
      int result = 1;
      for (int i = 1; i <= d; i++) {
        result = result * i;
      }
      sum = sum + result;
      n = n / 10;
    }
    if (sum == t)
      System.out.println(t + " is an strong number");
    else
      System.out.println(t + " is not an strong number");
  }
}