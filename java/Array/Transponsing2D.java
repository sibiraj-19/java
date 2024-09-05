package Array;

import java.util.*;

public class Transponsing2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int ar[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
              ar[i][j]=sc.nextInt();
            }
            
        }
        String og=Arrays.deepToString(ar);
        System.out.println("Original Array : "+ og); 

        int t[][]=new int[b][a];
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
              t[j][i]=ar[i][j];
            }          
        }
            String tr= Arrays.deepToString(t);
             System.out.println("Transepose : "+tr); 
          
    }
}
