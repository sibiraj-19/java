package HashSet;
import java.util.*;
public class HS {
    public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<String>();  
  set.add("Ravi");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  } 
  HashSet<Integer> num=new HashSet<Integer>();  
 num.add(1);
 num.add(3);
 num.add(2);
 // printing the number in sorted form 
 for (Object elem : num) {
     System.out.println(elem);
 }
 System.out.println("size of the array:" +num.size());
 System.out.println("contains value :"+ num.contains(0));
} 
}
