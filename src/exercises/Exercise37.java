package exercises;

import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter matrix row & column :  ");
        int row= sc.nextInt(),column = sc.nextInt();

        int[][] matrix = new int[row][column];
        for (int i=0 ; i<row ; i++){
            for (int j =0 ; j <column ; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        //output..
        System.out.println("Matrix : ");
        for (int i=0 ; i<row ; i++){
            for (int j =0 ; j <column ; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
