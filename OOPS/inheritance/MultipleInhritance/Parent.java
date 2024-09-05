package MultipleInhritance;

interface  father{
 void fa();
}
interface  mother{
    void mo();
}
class child implements father,mother{
public void fa(){
    System.out.println("xxx");

}
public void mo(){
    System.out.println("yyy");
}
public void ch(){
System.out.println("zzz");
}
}
public class Parent {
    public static void main(String[] args) {
      child c=new child();
      c.fa();
      c.mo();  
      c.ch();
    }
}
