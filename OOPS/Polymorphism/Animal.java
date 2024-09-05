package Polymorphism;
/* Polymorphism in Java is a concept by which we can perform a single action in different ways.
There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
     */
    
class breed{
    void name(){
        System.out.println("Type of  animal");
    }
}
class Dog extends breed{
    void name(){
        System.out.println("Type of  Dog");
    }
}
class Cat extends breed{
    void name(){
        System.out.println("Type of  Cat");
    }
}


public class Animal {
    public static void main(String[] args) {
        breed type =new breed();
        type.name();
        breed dog= new Dog();
        dog.name();
        breed cat =new Cat();
        cat.name();
    }
}
