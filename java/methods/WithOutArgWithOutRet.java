package methods;

import java.util.Scanner;

public class WithOutArgWithOutRet {
    public static void Divide(){
         Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt();
        int num2=sc.nextInt();
        int div=num1/num2;
       System.out.println("The Divide value is "+div);
    }
    public static void main(String[] args) {
        Divide();
    }

}
