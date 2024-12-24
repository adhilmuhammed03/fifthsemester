import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        int rows , cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter  " + rows * cols + "Numbers of the matrix" );
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Trace of the matrix 
        int trace = 0;
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < cols ; j++){
                if(i == j ){
                    trace += matrix[i][j];
                }
            }
        }
        System.out.println("The trace of the matrix is " + trace);
        int [] [] transpose = new int[matrix.length][matrix[0].length];
         for(int i = 0 ; i < rows; i++){
            for(int j =0 ; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            }
         }

         System.out.println("The transpose of the matrix is : ");
         for(int i = 0 ; i < transpose.length ; i++){
            for(int j = 0 ; j < transpose[0].length ; j++){
                System.out.print(transpose[i][j] + " ");
            }System.out.println();
         }



        sc.close();
    }
}
