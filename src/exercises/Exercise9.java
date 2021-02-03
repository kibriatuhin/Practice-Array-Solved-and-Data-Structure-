package exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 1/29/2021.
 */
//Write a Java program to insert an element (specific position) into an array.
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.printf("Enter %d number = " , myArray.length);
        for (int i=0 ; i< myArray.length ; i++){
            myArray[i] =  sc.nextInt();
        }
        System.out.printf("Enter insert index number = ");
        int indexNo = sc.nextInt();
        System.out.printf("Enter %d index value = " , indexNo);
        int value = sc.nextInt();
        System.out.println("Orginal Array = " + Arrays.toString(myArray));
        for (int i=myArray.length-1 ; i> indexNo ; i--){
            myArray[i] = myArray[i-1];
        }
        myArray[indexNo] = value;
        System.out.println("New value = " + Arrays.toString(myArray));
    }
}
