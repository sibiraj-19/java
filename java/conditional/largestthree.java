package conditional;
public class largestthree {
    public static void main(String[] args) {
        int a=100;
        int b=78;
        int c=199;
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else if(b>c){
            System.out.println("b is largest");
           
        }
        else{
            System.out.println("c is largest");

        }

        

    }
}



