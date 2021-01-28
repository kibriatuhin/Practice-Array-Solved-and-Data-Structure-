package array1D;

import java.util.Scanner;

/**
 * Created by USER on 1/26/2021.
 */
public class SImple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        int sum=0;
        for (int i=1 ; i<number.length ; i++){
            number[i] = sc.nextInt();
        }
        for (int i=0 ; i<number.length ; i++){
            System.out.println(number[i]);
            sum = sum + number[i];

        }
        System.out.println("Sum of all number = " + sum);

        int length = number.length;
        System.out.println("array size="+length);
    }
}
