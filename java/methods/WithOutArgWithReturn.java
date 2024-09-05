package methods;

import java.util.Scanner;

public class WithOutArgWithReturn {
    public static int Multiply(){
        Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt();
        int num2=sc.nextInt();
        int mul=num1*num2;
        return(mul);
    }
    public static void main(String[] args) {
        System.out.println(Multiply()+" is the Multiplied value");
    }
}
