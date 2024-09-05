package Polymorphism;
/*
method overriding
 If subclass (child class) has the same method as declared in the parent class,
  it is known as method overriding in Java.
 */

 class Vehicle{  
        void run(){
      System.out.println("Vehicle is running");
    }  
  }  
  
  class Bike extends Vehicle{  
      
    void run(){
      System.out.println("Bike is running safely");
    }
  }

public class OverRiding{
    public static void main(String args[]){ 
  Vehicle vch=new Vehicle();
  vch.run();
     Bike obj = new Bike();
        obj.run();

        }  
}
