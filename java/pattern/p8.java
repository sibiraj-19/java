// * * * * * 
//   * * * *
//     * * *
//       * *
//         *
import java.util.Scanner;

public class p8 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j<i){
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");  }
            }         
              System.out.println("");
        }
    }
}
