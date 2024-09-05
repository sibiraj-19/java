package MultilevelInheritance;

public class Student {
    void name(){
        System.out.println("Sibi");
    }
}
class id extends Student{
    void roll(){
        System.out.println("1");
        
    }
}
 class std extends id{
    void grade(){
        System.out.println("12");  
    }
    public static void main(String args[]){
        std a= new std();
        a.name();
        a.roll();
        a.grade();
        
    }

    
}
