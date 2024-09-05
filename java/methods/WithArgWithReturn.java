package methods;
import java.util.Scanner;
class  WithArgWithReturn{
public static int Addition(int a, int b){

    return (a+b);
}   
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int sum =Addition(num1 , num2);
     System.out.println(sum +" is the added value");
}
}