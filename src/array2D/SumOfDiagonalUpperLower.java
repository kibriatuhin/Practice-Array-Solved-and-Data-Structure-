package array2D;

import java.util.Scanner;

/**
 * Created by USER on 1/27/2021.
 */
public class SumOfDiagonalUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfDiagonal = 0, upperTriangle =0 ,lowerTriangle = 0 ;
        int[][] matrix = new int[3][3];
        System.out.println("Enter Matrix = ");
        for (int row=0 ; row<3 ; row++){
            for (int col=0 ; col<3 ; col++){
                System.out.printf("Matrix[%d][%d] = ",row,col );
                matrix[row][col] = sc.nextInt();
            }
        }

        //sum of diagonal , upper triangle , lower triangle
        for (int row=0 ; row<3 ; row++){
            for (int col=0 ; col<3 ; col++){
                if (row ==col){
                    sumOfDiagonal = sumOfDiagonal+matrix[row][col];
                }
                if (row<col){
                    upperTriangle = upperTriangle+matrix[row][col];
                }
                if (row>col){
                    lowerTriangle = lowerTriangle + matrix[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal = " +sumOfDiagonal);
        System.out.println("Uppper triangle = " + upperTriangle);
        System.out.println("Lower triangle = " + lowerTriangle);

    }
}
