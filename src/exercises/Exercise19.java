package exercises;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];
        System.out.println("Enter matrix 1 = ");
        for (int row=0 ; row <2 ; row++){
            for (int col=0 ; col<3 ; col++){
                matrix1[row][col] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 = ");
        for (int row=0 ; row <2 ; row++){
            for (int col=0 ; col<3 ; col++){
                matrix2[row][col] = sc.nextInt();
            }
        }
        System.out.println("sum of matrix1 + matrix2 = ");
        for (int row=0 ; row <2 ; row++){
            for (int col=0 ; col<3 ; col++){
                System.out.print(matrix1[row][col] + matrix2[row][col] + " ");
            }
            System.out.println();
        }

    }
}
