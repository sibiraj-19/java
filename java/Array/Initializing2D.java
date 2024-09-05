package Array;

import java.util.Scanner;

public class Initializing2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),u=sc.nextInt();
        int ar[][] =new int[l][u];
        for (int i =0; i <l ; i++) {
            for(int j=0;j<u;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        for (int i =0; i <l ; i++) {
            for(int j=0;j<u;j++){
                System.out.printf("\n ar[%d][%d]:"+ar[i][j],i,j);
            }
        }

    }
}