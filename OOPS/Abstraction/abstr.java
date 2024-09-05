package Abstraction;

/*
 Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces 
 */

abstract class Animal {
      public abstract void animalSound();
    public void sleep() {
      System.out.println("Zzz");
    }
  }
class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
 public class abstr {
    public static void main(String[] args) {
      Pig myPig = new Pig(); 
      myPig.animalSound();
      myPig.sleep();
    }
  }
