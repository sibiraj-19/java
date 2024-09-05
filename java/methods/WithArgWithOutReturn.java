package methods;
import java.util.Scanner;

public class WithArgWithOutReturn {
    public static void Subract(int a,int b){
         int dif =(a-b);
        System.out.println("The Subracted value is "+dif);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int num1=sc.nextInt();
    int num2=sc.nextInt();
    Subract(num1 , num2);
    }

}
