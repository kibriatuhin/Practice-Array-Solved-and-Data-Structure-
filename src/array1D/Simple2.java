package array1D;

import java.util.Scanner;

/**
 * Created by USER on 1/27/2021.
 */
public class Simple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.printf("Enter five number : ");
        for (int i=0 ; i<num.length ; i++){
            num[i] = sc.nextInt();

        }
        int max = num[0];
        int min = num[0];
        for (int i=0 ; i<num.length ; i++){
            if (max < num[i]){
                max = num[i];

            }
            if (min > num[i]){
                min = num[i];
            }
        }
        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);
    }
}
