import java.util.*;
public class repeated {
    // 1st repeated from the end

    public static void main(String args[]){
        int input1[]={1,2,4,1,2,8};
          HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
          int count=0;
          for(int i=input1.length-1;i>=0;i--){
              if(input1[i]>0){
                  if(map.containsKey(input1[i])){
                      System.out.print(input1[i]);
                      count++;
                      break;
                      
                  }
                
                  map.put(input1[i],1);
         }
          }
          if(map.isEmpty()){
              System.out.print("0");
          }
        if(count==0){
              System.out.print(input1[input1.length-1]);
          }
          
    }
}

 

