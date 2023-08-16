//48. Write a JAVAprogram to print all Strong numbers between 1 to n.
import java.util.*;

class Strong2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int N = sc.nextInt();

    for (int j = 1; j <= N; j++) {
      int t = j;
      int num=j;
      int sum = 0;
      
      while (num > 0) {
        int d = num % 10;
        int result = 1;
        for (int i = 1; i <= d; i++) {
          result = result * i;
        }
        sum = sum + result;
        num = num / 10;
      }
      if (sum == t)
        System.out.println(t + " is an strong number");
     // else
       // System.out.println(t + " is not an strong number");
    }
  }
}