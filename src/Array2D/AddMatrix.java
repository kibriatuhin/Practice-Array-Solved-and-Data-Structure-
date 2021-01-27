package Array2D;

import java.util.Scanner;

/**
 * Created by USER on 1/27/2021.
 */
public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.println("Enter Matrix A = ");
        for (int row=0 ; row<2 ; row++){
            for (int col=0 ; col<3 ; col++){
                System.out.printf("A[%d][%d] = ", row,col);
                A[row][col] = sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B = ");
        for (int row=0 ; row<2 ; row++){
            for (int col=0 ; col<3 ; col++){
                System.out.printf("B[%d][%d] = ", row,col);
                B[row][col] = sc.nextInt();
            }
        }

        System.out.println("Matix A = ");
        for (int row=0 ; row<2 ; row++){
            for (int col=0 ; col<3 ; col++){
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Matix B = ");
        for (int row=0 ; row<2 ; row++){
            for (int col=0 ; col<3 ; col++){
                System.out.print(B[row][col] + " ");
            }
            System.out.println();
        }

        //Adding 2 matrix
        System.out.println("A + B = ");
        for (int row=0 ; row<2 ; row++){
            for (int col=0 ; col<3 ; col++){
                System.out.print(A[row][col]+B[row][col] + " ");
            }
            System.out.println();
        }
    }

}
