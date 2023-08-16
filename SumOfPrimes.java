
//41. Write a JAVAprogram to find sum of all prime numbers between 1 to n.
import java.util.*;

class SumOfPrimes {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter range (a to b)to print prime numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;

    for (int i = a; i <= b; i++) {
      int count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0)
          count = count + 1;
      }
      if (count == 2)
        sum = sum + i;
    }
    System.out.println("the sum of all primes from " + a + " to " + b + " is: " + sum);
  }
}