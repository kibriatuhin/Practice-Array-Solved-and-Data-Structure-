package array2D;

import java.util.Scanner;

/**
 * Created by USER on 1/27/2021.
 */
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] number = new int[2][3];
        System.out.println("Enter six value : ");
        for (int row=0 ; row<2 ; row++ ){
            for (int col=0 ; col<3 ; col++){
                number[row][col] = sc.nextInt();
            }

        }
        System.out.println("A = ");
        for (int row=0 ; row<2 ; row++ ){
            for (int col=0 ; col<3 ; col++){
                System.out.print(number[row][col] + " " );
            }
            System.out.println();
        }

    }
}

class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        //matrix A
        System.out.println("Enter matrix A = ");
        for (int row=0 ; row<2 ; row++ ){
            for (int col=0 ; col<3 ; col++){
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = sc.nextInt();
            }
        }
        //matrix B
        System.out.println("Enter matrix B = ");
        for (int row=0 ; row<2 ; row++ ){
            for (int col=0 ; col<3 ; col++){
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = sc.nextInt();
            }
        }

        System.out.println("Matrix A = ");
        for (int row=0 ; row<2 ; row++ ){
            for (int col=0 ; col<3 ; col++){
                System.out.print(A[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println("Matrix B = ");
        for (int row=0 ; row<2 ; row++ ){
            for (int col=0 ; col<3 ; col++){
                System.out.print(B[row][col] + " " );
            }
            System.out.println();
        }

    }
}
