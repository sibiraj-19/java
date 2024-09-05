package Array;
public class Multiply2D {
    public static void main(String[] args) {
        // Scanner sc=new  Scanner(System.in);
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] array2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int sum=0;
        int p[][]=new int[array1.length][array2[0].length];
       for(int i=0;i<array1.length;i++){
        for(int j=0;j< array2[0].length;j++){
            for (int k = 0; k < array2.length; k++) {
                p[i][j] += array1[i][k] * array2[k][j];
                sum=p[i][j];
                
            }

                   
                      }
                      System.out.println(sum);
       }


    }
}
