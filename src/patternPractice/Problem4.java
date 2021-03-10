package patternPractice;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 */
public class Problem4 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any number : ");
        int n = sc.nextInt();
        for (int i=0 ; i<n ; i++){
            for (int j=n ; j>=i ; j--){
                System.out.print( " ");
            }
            for (int k=0 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter row number = ");
        int row = sc.nextInt();
        for (int i=0 ; i<row ; i++){
            for (int j=2*(row-i) ; j>0 ; j--){
                System.out.print(" ");
            }
            for (int k=0 ; k<i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
