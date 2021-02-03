package exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 1/29/2021.
 */
//Write a Java program to copy an array by iterating the array.
public class Exercise8 {
    public static void main(String[] args) {
        int[] n = {5,6,7,8,9,10};
        int[] n2 = new int[7] ;
        for (int i=0 ; i<n.length ; i++){
            n2[i] = n[i];
        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(n2));

    }
}
