package conditional;

public class Leapyearornot {
    public static void main(String args[]){
        int yr=2024;
        if(yr%4==0){
            System.err.println("The given year is leap year");
        }
        else{
            System.err.println("The given year is not a leap year");

        }
    }
}
