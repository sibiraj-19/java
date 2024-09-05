package Constroctor;

public class PrameterableConstructor {
  int x;
    public PrameterableConstructor(int x){
  this. x=x;
    }
    public static void main(String[] args) {
        PrameterableConstructor pc=new PrameterableConstructor(5);
        System.out.println(pc.x);
    }
}
