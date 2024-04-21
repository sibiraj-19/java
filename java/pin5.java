
   import java.util.*;
   public class pin5 {
 
   
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
             
            int input1=sc.nextInt();
            int input2=sc.nextInt();
            int input3=sc.nextInt();
            int input4=sc.nextInt();
            // int a=even(input1+input2+input3);
            
            //   int b=odd(input1+input2+input3);
            
           
        if(input4%2==0)
        System.out.println(even(input1)+even(input2)+even(input3));
        else
        System.out.println(odd(input1)+odd(input2)+odd(input3));
    
    }
    public static int even (int n)
    {
        int b=n;int e2=0;
        while(b>0){
                int f=b%10;
                if(f%2==0){
                   e2+=f;
                }
                
    }
    return e2;
} 
 public static int odd (int n)
    {
        int b=n;int o2=0;
        while(b>0){
                int f=b%10;
                if(f%2==1){
                   o2+=f;
                }
                
    }
    return o2;
}}

