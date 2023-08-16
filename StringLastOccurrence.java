//71. Write a JAVAprogram to find last occurrence of a character in a given string.
import java.util.*;
class StringLastOccurrence
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
  
     System.out.println("enter a string");
     String str=sc.nextLine();
    System.out.println("enter a charector");
    String ch=sc.nextLine();
     System.out.println(" last occurence index"+str.lastIndexOf(ch));
}
}