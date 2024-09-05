package Constroctor;
interface Car {
 default void test() {
        System.out.println("Testing a car");
    }
}
// int liquid is the most power full object
//a b c d e f g h i  j  k l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
//A B C D E F G H I  J  K L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z

interface Bike {
    default void test() {
        System.out.println("Testing a bike");
    }
}
class PrepBytes implements Car, Bike {
    public void test() {                   //Super keyword is used to call the parent class method
        Car.super.test();                 //   and also access the parent class constructors.
        Bike.super.test();
    }
}
public class Superkeyword {
    public static void main(String[] args) {
        PrepBytes pb = new PrepBytes();
        pb.test();
    }
}
