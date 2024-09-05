
import java.util.*;

public class ParenthesesBalancer {

    public static int minInsertionsToBalance(String s) {
        int open = 0;
        int close = 0;
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                close++;
            }
        }
        balance = Math.abs(open - close);

        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        System.out.println(minInsertionsToBalance(p));
    }
}
