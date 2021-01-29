package exercises;

import java.util.Scanner;

/**
 * Created by USER on 1/29/2021.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        int max , min;
        System.out.printf("Enter %d number = " , myArray.length);
        for (int i=0 ; i<myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }
        max = myArray[0];
        min = myArray[0];
        for (int i=0 ; i<myArray.length ;  i++){
            if (max<myArray[i]){
                max = myArray[i];
            }
            if (min > myArray[i]){
                min = myArray[i];
            }
        }
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value =  " +min);

    }
}
