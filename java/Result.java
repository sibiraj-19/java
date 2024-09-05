
import java.util.*;

public class Result {

    public static String Palindrome(String Str) {
        String str = Str;
        StringBuilder rev;
        StringBuilder b = new StringBuilder(str);
        rev = b.reverse();
        if (rev.equals(b)) {
            return breakPalindrome(str);
        } else {
            return ("no palindrome");
        }
    }

    public static String breakPalindrome(String palindromeStr) {
        int length = palindromeStr.length();
        String ns = "";
        int count = 0, c = 0;
        char[] chars = palindromeStr.toCharArray();
        for (int i = 0; i < length; i++) {
            if (chars[0] == chars[i]) {
                c++;
            }
        }
        if (c == length) {
            return "IMPOSSIBLE";
        }
        if (length == 1) {
            return "IMPOSSIBLE";
        }

        //abba
        for (int i = 0; i < length; i++) {
            if (chars[i] != 'a') {
                count++;
                // System.out.println(count);
                if (count == 1) {
                    chars[i] = 'a';
                    ns += chars[i];
                    //   System.out.println("a :"+ns);
                } else {
                    ns += chars[i];
                    // System.out.println("!a :"+ns);

                }

            } else 
            {
                ns += chars[i];
                // System.out.println("=a :"+ns);
            }
        }
        return (ns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Result.Palindrome(s));
    }

}
