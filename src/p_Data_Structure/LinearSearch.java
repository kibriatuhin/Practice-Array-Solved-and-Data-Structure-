package p_Data_Structure;

import java.util.Scanner;

/**
 * Created by USER on 1/29/2021.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] myArray = {10,20,30,40,50};
        boolean result = contains(myArray,60);
        System.out.println(result);

    }
    public static boolean contains(int[] myArrray , int value ){
        for (int i=0 ; i< myArrray.length ; i++){
            if (myArrray[i] ==value){
                return true;
            }
        }
        return false;
    }
}

class LinearTest{
    public static boolean contains(int[] myArrray , int value ){
        for (int i=0 ; i< myArrray.length ; i++){
            if (myArrray[i] ==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[0];

        System.out.printf("Enter how much array size do you want = ");
        int arraySize = sc.nextInt(),value;
        for (int i=0 ; i<= arraySize ; i++){
            myArray= new int[i];
        }
        System.out.printf("Enter %d number = " ,myArray.length);

        for (int i=0 ; i<myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }

        System.out.printf("Enter contains number = ");
        value= sc.nextInt();
        boolean result = contains(myArray,value);
        System.out.println(result);
    }
}
class Test{
    public static void main(String[] args) {
        int n = 3/2;
        System.out.println(n);
    }
}