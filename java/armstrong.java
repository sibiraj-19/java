import java.util.*;
public class armstrong {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int sum=0;
    int num=a;
    // System.out.println("a"+a+"num "+num);
    String s = Integer.toString(a);
    int d=s.length();
    while (a!=0){
       int b=a%10;
        sum+=Math.pow(b,d);
        a=a/10;
    }System.out.println(a);
    if(sum==num){
        System.out.print(num+" is a Armstrong number");
    }
    else{
        System.out.print(num+" is not a Armstrong number");

    }
    }
}
