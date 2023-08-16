
//69. Write a JAVAprogram to check whether a string is palindrome or not.
import java.util.*;

class StringPalindrome {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter astring to find palindrome or not");
    String str = sc.nextLine();
    String str2 = str;
    char ch[] = str.toCharArray();
    int length = ch.length;
    for (int i = 0; i < length / 2; i++) {
      char temp = ch[i];
      ch[i] = ch[length - 1 - i];
      ch[length - 1 - i] = temp;
    }
    String rev = String.valueOf(ch);
    if (rev.equals(str2)) {
      System.out.println("Given String is a Palindrome: ");
    } else
      System.out.println("Given String is not a Palindrome: ");
  }
}
