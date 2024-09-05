import java.util.*;
public class bankstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Check Banck Balance  Enter Number 1");
        System.out.println("To Withdraw Ampount Enter Number 2");
        System.out.println("To Deposit Ampount Enter Number 3");
        System.out.println("To Change Pin number Enter Number 4");
        System.out.println("To view bank detatils Enter Number 5");
        int number = sc.nextInt();
        switch (number) {   
            case 1:
                System.out.println("Your Bank balance is : Balance amount");
                break;
            case 2:
                System.out.println("Enter the Amount to be Withdraw");
                break;
            case 3:
                System.out.println("Enter the Amount to be Deposit");
                break;
            case 4:
                System.out.println("To change the pin number , Enter the new Pin number");
                break;
            case 5:
                System.out.println("Your Bank detatils are");
                break;
            default:
                System.out.println("Please Choose the correct Option");
        }
    }
}
