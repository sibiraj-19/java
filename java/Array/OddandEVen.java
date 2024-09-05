package Array;

import java.util.Scanner;

public class OddandEVen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of your Array");
        int l=sc.nextInt(),oddsum=0,evensum=0;
        String odd="",even="";
              int ar[]=new int[l];
              System.out.println("Enter your values");
              for (int i = 0; i < l; i++) {
                  ar[i]=sc.nextInt();
                  if(ar[i]%2==0){
                    even+=ar[i]+" ";
                    evensum+=ar[i];
                  }
                  else{
                    odd+=ar[i]+" ";
                    oddsum+=ar[i];
                  }
              }
              System.out.println("Odd: "+odd +" Sum : "+oddsum);
              System.out.println("Even: "+even+" Sum : "+evensum);

    }
}
