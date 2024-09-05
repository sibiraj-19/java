package SingleInheritance;

public class Animal {
    String a="Dog";
}
class voice extends Animal{
    String b="Bark";
    public static void main(String[] args) {
        voice c= new voice();
        System.out.println(c.a);
        System.out.println(c.b);
    }
}