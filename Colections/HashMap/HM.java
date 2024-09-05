package HashMap;

import java.util.HashMap;

public class HM {
     public static void main(String[] args) {

   HashMap<Integer,String> map=new HashMap<Integer,String>(); //Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");
   System.out.println(map);  
   map.put(1,"Grapes"); // trying duplicate key  

   System.out.println(map);
   System.out.println("size "+ map.size());
   System.out.println("get the item:" +map.get(1));
   map.remove(1);
   System.out.println("Remaining:"+ map);
   System.out.println(" Updated size"+ map.size());
}
}
