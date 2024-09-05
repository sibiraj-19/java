package Strings;
import java.util.Scanner;
public class Firstlast{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String input1=sc.next();
    String upper=input1.toUpperCase();
    if (input1 == null || input1.isEmpty()) {
        System.out.println("");
    }
    char firstChar = (upper.charAt(0));
    char lastChar = (upper.charAt(input1.length() - 1));
    System.out.println(firstChar + "." + lastChar);
}


}
