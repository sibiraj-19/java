import java.util.*;
public class passwordgenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int passwordlength=sc.nextInt();
           char [] password=new char[passwordlength];
           String Characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"0987654321"+"!@#$%^&*?~";
        //    System.out.println(Characters);
Random random=new Random();
           for (int i = 0; i < passwordlength; i++) {
               password[i]=Characters.charAt(random.nextInt(Characters.length()));
           }

           System.out.println(password);
    }
}
