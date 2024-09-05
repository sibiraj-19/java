package Strings;
import java.util.*;
public class Buffer{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        StringBuffer s= new StringBuffer(a);
         
         //Append a String 
        s.append("sibi");
        System.out.println(s+" :append");             //   hiisibi :append
        
        //To insert a string 
        s.insert(0,"welcome");
        System.out.println(s+" :inserted");           //  welcomehiisibi :inserted
        
        // To replace a string
        s.replace(0, 2, "helo");
        System.out.println(s+" :replace");            //  helolcomehiisibi :replace
        
        //To reverse a string
        s.reverse();
        System.out.println(s+" :reverse");            //  ibisiihemocloleh :reverse
        
    }
}
