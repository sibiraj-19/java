package Array;

import java.util.Arrays;
import java.util.Scanner;

public class descending {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of your Array");
int l=sc.nextInt();
      int ar[]=new int[l];
      System.out.println("Enter your values");
      for (int i = 0; i < l; i++) {
          ar[i]=sc.nextInt();
      }
      Arrays.sort(ar);
      String a=Arrays.toString(ar);
      StringBuffer s=new StringBuffer(a);
      s.reverse();
      System.out.println("Descending oder");

      System.out.println(s);
    //   for(int i=0;i<5;i++){
    //   System.out.println(ar[i]);
    // }
}
}
