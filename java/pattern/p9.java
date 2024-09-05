//       *       
//     * * *     
//   * * * * *   
// * * * * * * * 

import java.util.*;
public class p9 {
    public static void main(String arga[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=(a/2)+1;
        for(int i=1;i<=x;i++){
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

