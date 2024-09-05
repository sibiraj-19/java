    package conditional;

    public class numoralph {
        public static void main(String[] args) {
            String b="110h0";
            if((b.charAt(0)>=65 && b.charAt(0)<=90)||(b.charAt(0)>=97&&b.charAt(0)<=122)){
                System.out.println(" The given value is a Alphabet");
            }
        else if(b.charAt(0)>=48 && b.charAt(0)<=57){
                System.out.println("The given value is a number ");
            }
            else{
                System.out.println("The given value is not a number and not a Alphabet");
            }
        }
    }
