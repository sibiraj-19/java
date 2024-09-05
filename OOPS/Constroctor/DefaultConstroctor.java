package Constroctor;
//meathod name and the class name should be same ...
public class DefaultConstroctor {
    int x;
    public DefaultConstroctor() {
      x = 5; 
    }
    public static void main(String[] args) {
        DefaultConstroctor myObj = new DefaultConstroctor(); 
      System.out.println(myObj.x);
    }
  }

