import java .util.*;

public class factorial1 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <=a; i++){
            factorial*=i;
        }
        System.err.println("The factorial of "+a+" is "+factorial);
    }
}
