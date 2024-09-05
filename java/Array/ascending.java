package Array;
import java.util.*;
import java.util.*;
public class ascending {
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

      System.out.println("Ascending oder");

      System.out.print(a);
    //   for(int i=0;i<5;i++){
    //   System.out.println(ar[i]);
    // }
}
    
}