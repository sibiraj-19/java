package Strings;
import java.util.*;
public class favsong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the collection of songs (string): ");
        String input1 = sc.nextLine();
        
        System.out.print("Enter the number of songs in the playlist (integer): ");
        int input2 = sc.nextInt();

        int maxCount = 0;
        int n = input1.length();
int count=0;
        for (int i = 0; i< n-input2; i++) {
            String substring = input1.substring(i, i + input2);
            System.out.println(substring);
            int currentCount = 0;
            for (char c : substring.toCharArray()) {
                if (c == 'a') {
                    currentCount++;                //avsabaaysa  4
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
           else if(currentCount==maxCount){
                count++;
            }
        }
       System.out.println(count);
    }


}

