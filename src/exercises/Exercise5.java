package exercises;

import java.util.Scanner;

/**
 * Created by USER on 1/28/2021.
 */
// Write a Java program to test if an array contains a specific value.
class FinalTest{

    public static boolean contains(int[] input1 , int input2){
        for (int i=0 ; i<input1.length ; i++){
            if (input1[i] == input2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input1  = new int[5];
        System.out.printf("Enter any five number = ");
        for (int i=0 ; i<input1.length ; i++){
            input1[i] = sc.nextInt();
        }
        System.out.printf("Enter contains number = ");
        int input2 = sc.nextInt();

        boolean result = contains(input1,input2);
        System.out.println(result);
    }
}


//test
public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        int input2,count=0 ;
        System.out.printf("Enter any five number : ");
        for(int i=0 ; i<input.length ; i++){
            input[i] = sc.nextInt();
        }

        System.out.printf("Enter any number in five number = ");

        input2 = sc.nextInt();
        for (int i=0 ; i<input.length ; i++){
            if (input[i] ==input2){
                count++;
                break;
            }
        }
        if (count==1){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}


