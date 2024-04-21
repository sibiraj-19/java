import java.util.Scanner;

public class pin6 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		int a=small(input1);
		int b=large(input2);
		int c=large(input3);
		System.out.print((a*b*c)+input4);
		
	}
	public static int small(int n){
	    int small=Integer.MAX_VALUE;
	    while(n>0){
	        int temp=n%10;
	        if(temp<small){
	            small=temp;
	        }
	        n=n/10;
	    }
	    return small;
	}
	public static int large(int n){
	    int large=Integer.MIN_VALUE;
	    while(n>0){
	        int temp=n%10;
	        if(temp>large){
	            large=temp;
	        }
	        n=n/10;
	    }
	    return large;
}}
