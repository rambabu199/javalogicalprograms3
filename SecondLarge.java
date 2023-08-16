//51. Write a JAVAprogram to find second largest element in an array.
import java.util.*;

class SecondLarge {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    Arrays.sort(arr);
    System.out.println("after sort");
    for(int i=0;i<n;i++)
      System.out.print(" "+arr[i]);
    System.out.println("\n the second largest element in array: "+arr[n-2]);
  }
}