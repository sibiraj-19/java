package Array;
import java.util.Arrays;
import java.util.Scanner;
public class MergingTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of your Array 1");
int l1=sc.nextInt();
System.out.println("Enter the length of your Array 2");
 int l2=sc.nextInt();
      int ar[]=new int[l1];
      int br[]=new int[l2];
      int cr[]=new int[l1+l2];
      int j=0;
      System.out.println("Enter Array 1");
      for (int i = 0; i < l1; i++) {
          ar[i]=sc.nextInt();
      }
      System.out.println("Enter Array 2");
      for (int i = 0; i < l2; i++) {
        br[i]=sc.nextInt();
    }
    for (int i = 0; i < l1; i++) {
        cr[j]=ar[i];
        j++;
    }
    for (int i = 0; i < l2; i++) {
        cr[j]=br[i];
        j++;
    }
    System.out.println("The Merged Array : "+Arrays.toString(cr));
 
    }
}
