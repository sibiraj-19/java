 
 
 import java.util.*;
public class pin2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		int a=input1;
		int b=input2;
		int c=input3;
	int odd=(a/10)%10+a/1000+(b/10)%10+b/1000+(c/10)%10+c/1000;
	int even=a%10+(a/100)%10+b%10+(b/100)%10+c%10+(c/100)%10;
	if(input4%2==0)
	System.out.println(even-odd);
	else
	System.out.println(odd-even);
	}
}