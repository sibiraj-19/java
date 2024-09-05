package HirearchialInheritance;

class subject{
    void sub(){
        System.out.println("English");
    }
}
class Std1 extends subject{
    void mark1(){
        System.out.println("23");
    }
}

class Std2 extends subject{
    void mark2(){
        System.out.println("32");
    }
}
public class School{
    public static void main(String args[]){
        Std2 mrk=new Std2();
        mrk.sub();
        mrk.mark2();
        Std1 mrk1=new Std1();
        mrk1.sub();
        mrk1.mark1();

    }
}
