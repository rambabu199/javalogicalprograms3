//30. Write a JAVAprogram to calculate sum of digits of a number

import java.util.*;

class Demo {
  void digit(int n) {
    int sum = 0, d;

    while (n > 0) {
      d = n % 10;
      sum = sum + d;
      n = n / 10;
    }
    System.out.println("the number of digits in the given number is :" + sum);
  }

}

class SumOfDigits {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Demo d = new Demo();
    System.out.println("enter a number");
    int n = sc.nextInt();
    d.digit(n);
  }
}