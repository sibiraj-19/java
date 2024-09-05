// *       *
//  *     * 
//   *   *  
//    * *   
//     *    
//    * *   
//   *   *  
//  *     *
// *       *
import java.util.*;
public class p3 {
	public static void main(String[] args) {
	    Scanner you=new Scanner(System.in);
	    int a=you.nextInt();
	    int x=(2*a)-1;
	    for(int i=1;i<=x;i++){
	        for(int j=1;j<=x;j++){
	            if(i==j || i+j==(x+1)){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");        
	            }
	        }
		System.out.println("");
	}
	}
}

