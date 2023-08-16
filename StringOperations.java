//64. Write a JAVAprogram to find length of a string and compare and concatenate two strings.
import java.util.*;

class StringOperations {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give data for   string1");
    String s1 = sc.nextLine();
    System.out.println("Give data for   string2");
    String s2 = sc.nextLine();
    System.out.println("length of the  string1 is: "+s1.length());
    System.out.println("length of the  string2 is: "+s2.length());
    System.out.println("comparing string1 with string2 is: "+s1.compareTo(s2));
    System.out.println("cancatinating string1 with string2 "+s1.concat(s2));
    
  }
}