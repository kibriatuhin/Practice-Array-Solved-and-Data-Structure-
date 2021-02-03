package p_Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 1/30/2021.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] myArray = {5 , 10 ,20,11,1};
        System.out.println("Orginal Array = " + Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println("After using bubble sort = " + Arrays.toString(myArray));
    }
    public static void bubbleSort(int[] myArray ){
        int temp;
        for (int i=0 ; i<myArray.length ; i++){
            for (int j=0 ; j<myArray.length-1-i ; j++){
                if (myArray[j] > myArray[j+1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1] ;
                    myArray[j+1] = temp;
                }
            }
        }
    }


}
//Test ascending
class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter array length = ");
        int length = sc.nextInt(),temp ;
        int[] myArray = new int[length];
        System.out.printf("Enter %d number = " , myArray.length);
        for (int i=0 ; i<myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }
        System.out.println("Orginal Array = " + Arrays.toString(myArray));

        for (int i=0 ; i<myArray.length ; i++){
            for (int j=0 ; j< myArray.length-1-i ; j++){
                if (myArray[j] > myArray[j+1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        System.out.println("After using bubble sort = " + Arrays.toString(myArray));



    }
}
//test descending
class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter array length = ");
        int length = sc.nextInt(),temp ;
        int[] myArray = new int[length];
        System.out.printf("Enter %d number = " , myArray.length);
        for (int i=0 ; i<myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }
        System.out.println("Orginal Array = " + Arrays.toString(myArray));

        for (int i=0 ; i<myArray.length ; i++){
            for (int j=0 ; j<myArray.length-1-i ; j++){
                if (myArray[j] < myArray[j+1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        System.out.println("After using bubble sort = " + Arrays.toString(myArray));
    }
}
