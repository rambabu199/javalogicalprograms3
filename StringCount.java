//65. Write a JAVAprogram to find total number of alphabets, digits or special character in a string.
import java.util.*;

class StringCount {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give data for   string");
    String str = sc.nextLine();
    char ch[]=str.toCharArray();
    int countAlfa=0,countdigit=0,countspecial=0;
    for(int i=0;i<ch.length;i++)
      {
        if(Character.isAlphabetic(ch[i]))
          countAlfa++;
        else if(Character.isDigit(ch[i]))
          countdigit++;
        else
          countspecial++;
      }
    System.out.println("Total number of Alphabets in given String is: "+countAlfa);
    System.out.println("Total number of Digits in given String is: "+countdigit);
    System.out.println("Total number of Special Symbols in given String is: "+countspecial);
    
  }
}