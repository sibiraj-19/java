import java.util.*;
public class prime1{

    public static void main(String args[]) {
        // int v[] = { 10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67 };
        int v[]={10,18,50,25,96};
          int min=Integer.MAX_VALUE,s=0,a=0,sum=0;
          for(int i=0;i<v.length;i++){
              int p=v[i];
              int count=0;
              for(int j=1;j<=p;j++){
                  if(p%j==0){
                      count++;
                  }
             }
              if(count==2){
                  a++;
                  System.out.print(p+" ");
                  s+=p;
                  if(p<min){
                      min=p;
                  }
              }
              count=0;
          }
        //   System.out.print(s-min);
    // //if there is no prime num ;
        if(a!=0){
        System.out.print(s - min);}
        
        else{
            Arrays.sort(v);
            for(int i=0;i<v.length;i++){
                sum+=v[i];
            }
            System.out.print(sum-v[0]);
        }
        }
}