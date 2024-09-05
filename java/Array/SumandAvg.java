package Array;

import java.util.*;

public class SumandAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your Array");
        int l = sc.nextInt();
        int sum = 0;
        int avg;
        int ar[] = new int[l];
        System.out.println("Enter your values");
        for (int i = 0; i < l; i++) {
            ar[i] = sc.nextInt();
            sum += ar[i];
        }
        avg = sum / l;
        System.out.println("The Sum of given Array is : " + sum);
        System.out.println("The Average of given Array is : " + avg);

    }
}
