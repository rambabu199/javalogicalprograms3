//52. Write a JAVAprogram to find maximum and minimum element in an array.
import java.util.*;

class SmallAndBigInArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<=n-1;i++)
      {
        if(arr[i]>max)
          max=arr[i];
        if(arr[i]<min)
          min=arr[i];
      }
    System.out.println(min+"min"+max+"max");
  }
}