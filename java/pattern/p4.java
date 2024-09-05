// * * * * * 
// *
// * * * * * 
//         * 
// * * * * * 

import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=(a/2)+1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
               if(i==1 || i==a || i==x || (i<x && j==1) || (i>x && j==a)){
                System.out.print("* ");
               }
               else{
                System.out.print("  ");
               }
            }
            System.out.println("");
        }
    }
}
