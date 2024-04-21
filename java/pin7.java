
import java.util.*;
public class pin7{


 
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
          
         int input1=sc.nextInt();
         int input2=sc.nextInt();
         int input3=sc.nextInt();
        int a[]=new int [10];
        int ar[]={input1,input2,input3};
        String s="";
        for(int i=0;i<ar.length;i++){
            while(ar[i]>0){
                int d= ar[i]%10;
                a[d]++;
                ar[i]=ar[i]/10;
            }
        }
        int max=0,maxf=0;
        int min=Integer.MAX_VALUE ,minf=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=max){
                max=a[i];
                maxf=i;
            }
            if(a[i]>0){
            if(a[i]<min){
                min=a[i];
                minf=i;
            }
        }}
        //  System.out.println(maxf);
        //   System.out.println(minf);
        s=s+maxf+minf;
        // System.out.println(s);
        String s1="";
        long max1=0,min1=9;
        s1=s1+input1+input2+input3;
        //   System.out.println(s1);
        long t=Long.parseLong(s1);  
        while(t>0){
            long u=t%10;
            if(u>max1){
                max1=u;
            }
            if(u<min1){
                min1=u;
            }
            t=t/10;
        }
        s=s+max1+min1;
        System.out.println(s);
       }}