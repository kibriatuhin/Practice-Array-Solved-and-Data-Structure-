package exercises;

import java.util.Scanner;

/**
 * Created by USER on 1/28/2021.
 */
//Write a Java program to find the index of an array element.
 class FinalTest2{
     public static int findIndex(int[] array , int value){
         if (array == null) return -1;
         for (int i=0 ; i<array.length ; i++){
             if (value == array[i]){
                 return i;
             }
         }
         return -1;
     }
    public static void main(String[] args) {
        int[] myArray = {5,6,7,8,9};
        int result =findIndex(myArray, 10);
        System.out.println(result);

    }
}

//test
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input1 = new int[5];
        System.out.printf("Enter any five number = " );
        for (int i=0 ; i<input1.length ; i++){
            input1[i] = sc.nextInt();
        }
        System.out.printf("Enter contains number = ");
        int input2 = sc.nextInt();
        for (int i=0 ; i<input1.length ; i++){
            if (input2 == input1[i]){
                System.out.printf("Index position of %d is : %d\n" , input2,i);
                break;
            }
            if (input1[i] == input1.length){
                System.out.printf("Value of %d not contains " , input2);
            }
        }

    }
}
