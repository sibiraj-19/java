package Polymorphism;
/*
Method Overloading
 If a class has multiple methods having same name but different in parameters, 
 it is known as Method Overloading
 */

 class Adder{  
    static int add(int a,int b){
        return a+b;
    }  
    static int add(int a,int b,int c){
        return a+b+c;
    }  
    }  
public class Overloding{
    public static void main(String[] args){  
System.out.println(Adder.add(1,1));  
System.out.println(Adder.add(1,10,100));  
}
}
