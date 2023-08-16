//28. Write a JAVAprogram to find sum of first and last digit of a number.

import java.util.*;

class SumOfLastAndFirst {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    long n = sc.nextLong();
    long last = n % 10;
    long first = 0;
    while (n > 0) {
      first = n % 10;
      n = n / 10;
    }
    int sum=(int)(first+last);
    System.out.println("the first digit of given number is: " + first + "\n the last digit of given number is: " + last+"\n the sum of first and last digits is : "+sum);
  }
}