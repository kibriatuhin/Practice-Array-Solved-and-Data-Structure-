package exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 1/30/2021.
 */
//Write a Java program to reverse an array of integer values.
public class Exercise11 {
    public static void main(String[] args) {
        int[] myArray = {5,3,2,1,4};
        int temp;
        System.out.println("orginal value = " + Arrays.toString(myArray));
        for (int i=0 ; i< myArray.length/2 ; i++){
            temp = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = temp;
        }
        System.out.println("reversce = " + Arrays.toString(myArray));
    }
}

