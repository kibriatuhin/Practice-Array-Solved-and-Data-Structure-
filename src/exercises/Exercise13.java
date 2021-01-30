package exercises;

import java.util.Scanner;

/**
 * Created by USER on 1/30/2021.
 */
//Write a Java program to find the duplicate values of an array of string values.
public class Exercise13 {
    public static void main(String[] args) {
        String[] myArray = {"Tuhin","Tethye" , "Tuhin" , "Tamim" , "Tethye"};
        for (int i=0 ; i<myArray.length ; i++){
            for (int j= i+1 ; j<myArray.length ; j++){
                if (myArray[i].equals(myArray[j])){
                    System.out.print(myArray[i] + " ");
                }
            }
        }
    }
}
