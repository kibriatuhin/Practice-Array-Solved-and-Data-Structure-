package patternPractice;

import java.util.Scanner;

/*
 *****
 ****
 ***
 **
 *
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter row number : ");
        int n = sc.nextInt();
        for (int i=n ; i>0 ; i--){
            for (int j=n ; j>=i ; j--){
                System.out.print(" ");
            }
            for (int k=i ; k>0 ;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Teste{
    public static void main(String[] args) {
        for (int i=5 ; i>0 ; i--){
            System.out.println(i);
        }
    }
}