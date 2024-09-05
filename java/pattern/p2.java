//        1 
//       2  6 
//     3  7  10     
//   4  8  11  13   
// 5  9  12  14  15
public class p2 {
        public static void main(String[] args) {
            int n = 5; // size of the grid
            // Generate and print the pattern
            for (int row = 1; row <= n; row++) {
                // Print leading spaces for alignment
                for (int space = n- row; space > 0; space--) {
                    System.out.print("  ");
                }
                // Print the numbers in the pattern
                int value = row;
                for (int col = 0; col < row; col++) {
                    System.out.print(" "+value + " ");
                    value += (n - col - 1);
                }
                System.out.println(); 
            }
        }
    }
    

