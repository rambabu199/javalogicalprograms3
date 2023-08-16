//70. Write a JAVAprogram to find first occurrence of a character in a given string.
import java.util.*;
class StringFirstOccurence
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
  
     System.out.println("enter a string");
     String str=sc.nextLine();
    System.out.println("enter a charector");
    String ch=sc.nextLine();
     System.out.println(" first occurence index"+str.indexOf(ch, 0));
}
}