package Strings;

import java.util.*;

public class Prj1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.charAt(0) + " For charAt()");
        System.out.println(a.codePointAt(0) + " For codePointAt()");
        System.out.println(a.codePointBefore(1) + " For codePointBefore()");
        System.out.println(a.compareToIgnoreCase(b) + " For compareToIgnoreCase()");
        System.out.println(a.concat(b) + " For concat()");
        System.out.println(a.contains("S") + " For contains()");
        System.out.println(a.contentEquals(b) + " For contentEquals()");
        System.out.println(a.endsWith("i") + " For endsWith()");
        System.out.println(a.equals(b) + " For equals()");
        System.out.println(a.equalsIgnoreCase(b) + " For equalsIgnoreCase()");
        System.out.println(a.replace('i', 'p'));
        System.out.println(a.replaceAll("hii", "bye"));

        {
// format() isEmpty//
            String myStr = "Hello %s! One kilobyte is %,d bytes.";
            String myStr2 = "";
            System.out.println(myStr2.isEmpty());
            String result = String.format(myStr, "World", 1024);
            System.out.println(result);
        }

    }

}
