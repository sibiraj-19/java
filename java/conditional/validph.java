package conditional;


public class validph {
    public static void main(String[] args) {
        String num="8825925027";
        if(num.length()==10){
            if(num.charAt(0)=='9'|| num.charAt(0)=='8'|| num.charAt(0)=='7'|| num.charAt(0)=='6')
            {
                System.out.print("the number is valid");

            } 
            else{
                System.out.println("The entered number is not a ph number ");
            }

        }
        else{
            System.out.println("The entered number is not a ph number ");
        }
    }
}
