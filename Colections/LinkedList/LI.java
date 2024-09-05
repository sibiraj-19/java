package LinkedList;
import java.util.*;
public class LI {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList <String> a= new LinkedList<String>();
        a.add("WEEKS"); 
        a.add("Sunday");
        a.add("Monday");
        a.add("Tuesday");
        a.add("Wednesday");
        a.add("Thursday");
        a.add("Friday");
        a.add("Saturday");
        
        System.out.println("7 days in a Week are :");
        for (Object week : a) {
            System.out.println(week);
        }
        System.out.println("To get specific day Enter the number");
        int num=sc.nextInt();
        //  int day=num-1;
        System.err.println(a.get(Math.abs(num))+" is the "+num+" day");
        a.set(0,"weeks");
      // printing the new array using itretor
      Iterator itr=a.iterator();

      System.out.println("printing the new array using itretor");  
      while(itr.hasNext())  
      {    
          System.out.println(itr.next());  
      }  

       // printing the reverse array using List itretor
      
       ListIterator<String> rev=a.listIterator(a.size()); 
       System.out.println("printing the reverse array using List itretor");   
       while(rev.hasPrevious())  
       {    
        String str=rev.previous();  
        System.out.println(str);   
       } 

    }

}
