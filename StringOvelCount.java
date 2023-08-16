//66. Write a JAVAprogram to count total number of vowels and consonants in a string.
import java.util.*;

class StringOvelCount {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give data for   string");
    String str = sc.nextLine();
    char ch[]=str.toCharArray();
    int countovel=0,countconsonent=0;
    for(int i=0;i<ch.length;i++)
      {
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
          countovel++;
        else
          countconsonent++;
      }
    System.out.println("Total number of Ovels in given String is: "+countovel);
    System.out.println("Total number of consonents in given String is: "+countconsonent);
    
  }
}