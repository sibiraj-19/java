
import java.util.*;
public class pin4
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		int a=large(input1)*small(input1);
		int b=large(input2)*small(input2);
		int c=large(input3)*small(input3);
		System.out.println((a+b+c)-input4);
	}
	public static int small(int n){
	    int small=Integer.MAX_VALUE;
	    while(n>0){
	        int temp=n%10;
	        small=Math.min(small,temp);
	        n=n/10;
	    }
	    return small;
	}
	public static int large(int n){
	    int large=Integer.MIN_VALUE;
	    while(n>0){
	        int temp=n%10;
	        large=Math.max(large,temp);
	        n=n/10;
	    }
	    return large;
	}
}