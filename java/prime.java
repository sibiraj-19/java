import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();int c=0;
         for(int i=1;i<=num;i++){
           if(num%i==0){
            c++;
           }
         }
         if(c==2){
            System.out.print(num+" is a prime number");
         }
         else{
            System.out.print(num+" is not a prime number");

         }
    }
}
