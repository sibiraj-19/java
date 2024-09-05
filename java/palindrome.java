import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int num=a;
        String b="";
        while(a>0){
            int c=a%10;
            b+=c;
            a/=10;
        }
        int d=Integer.parseInt(b);
        if(num==d ){
            System.out.println("The given value is palindrome");
        }
        else{
            System.out.println("The given value is not a palindrome");

        }
        
    }

}
