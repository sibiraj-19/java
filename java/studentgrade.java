
import java.util.*;

public class studentgrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();
        int sum = mark1 + mark2 + mark3 + mark4 + mark5;
        int avg = sum / 5;
        {
            if (mark1 == 35) {
                System.out.println("Grade for Subject 1 is D");
            } else if (mark1 > 35 && mark1 <= 60) {
                System.out.println("Grade for Subject 1 is C");
            } else if (mark1 > 60 && mark1 <= 80) {
                System.out.println("Grade for Subject 1 is B");
            } else if (mark1 > 80 && mark1 <= 90) {
                System.out.println("Grade for Subject 1 is A");
            } else if (mark1 > 90 && mark1 <= 100) {
                System.out.println("Grade for Subject 1 is O");
            } else {
                System.out.println("Grade for Subject 1 is U");
            }
        }
        {
            if (mark2 == 35) {
                System.out.println("Grade for Subject 2 is D");
            } else if (mark2 > 35 && mark2 <= 60) {
                System.out.println("Grade for Subject 2 is C");
            } else if (mark2 > 60 && mark2 <= 80) {
                System.out.println("Grade for Subject 2 is B");
            } else if (mark2 > 80 && mark2 <= 90) {
                System.out.println("Grade for Subject 2 is A");
            } else if (mark2 > 90 && mark2 <= 100) {
                System.out.println("Grade for Subject 2 is O");
            } else {
                System.out.println("Grade for Subject 2 is U");
            }
        }
        {
            if (mark3 == 35) {
                System.out.println("Grade for Subject 3 is D");
            } else if (mark3 > 35 && mark3 <= 60) {
                System.out.println("Grade for Subject 3 is C");
            } else if (mark3 > 60 && mark3 <= 80) {
                System.out.println("Grade for Subject 3 is B");
            } else if (mark3 > 80 && mark3 <= 90) {
                System.out.println("Grade for Subject 3 is A");
            } else if (mark3 > 90 && mark3 <= 100) {
                System.out.println("Grade for Subject 3 is O");
            } else {
                System.out.println("Grade for Subject 3 is U");
            }
        }
        {
            if (mark4 == 35) {
                System.out.println("Grade for Subject 4 is D");
            } else if (mark4 > 35 && mark4 <= 60) {
                System.out.println("Grade for Subject 4 is C");
            } else if (mark4 > 60 && mark4 <= 80) {
                System.out.println("Grade for Subject 4 is B");
            } else if (mark4 > 80 && mark4 <= 90) {
                System.out.println("Grade for Subject 4 is A");
            } else if (mark4 > 90 && mark4 <= 100) {
                System.out.println("Grade for Subject 4 is O");
            } else {
                System.out.println("Grade for Subject 4 is U");
            }
        }
        {
            if (mark5 == 35) {
                System.out.println("Grade for Subject 5 is D");
            } else if (mark5 > 35 && mark5 <= 60) {
                System.out.println("Grade for Subject 5 is C");
            } else if (mark5 > 60 && mark5 <= 80) {
                System.out.println("Grade for Subject 5 is B");
            } else if (mark5 > 80 && mark5 <= 90) {
                System.out.println("Grade for Subject 5 is A");
            } else if (mark5 > 90 && mark5 <= 100) {
                System.out.println("Grade for Subject 5 is O");
            } else {
                System.out.println("Grade for Subject 5 is U");
            }
        }
        System.out.println("Your total Marks is " + sum);
        System.out.println("Your average mark is " + avg);
    }

}
