package Array;
import java.util.*;
public class Sum2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),sum=0;
        int ar[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
              ar[i][j]=sc.nextInt();
              sum+=ar[i][j];
            }
            
        }
        System.out.println("Sum : "+sum);
    }
}
