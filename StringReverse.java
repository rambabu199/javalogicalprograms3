
//68. Write a JAVAprogram to find reverse of a string.
import java.util.*;

class StringReverse {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter astring to reverse");
    String str = sc.nextLine();
    char ch[] = str.toCharArray();
    int length = ch.length;
    for (int i = 0; i < length / 2; i++) {
      char temp = ch[i];
      ch[i] = ch[length - 1 - i];
      ch[length - 1 - i] = temp;
    }
    String rev = String.valueOf(ch);
    System.out.println("reverse String is: " + rev);
  }
}
