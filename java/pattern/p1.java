// 1 6 11 16 21
// 2 7 12 17 22
// 3 8 13 18 23
// 4 9 14 19 24
// 5 10 15 20 25
public class p1{
    public static void main(String args[]){
        int k=7;
    for (int i = 1; i <=7; i++) {
        for (int j = 0; j<7;j++) {
          System.out.print(i+j*k+" ");
        }
        System.out.println("");
    }
    }
}