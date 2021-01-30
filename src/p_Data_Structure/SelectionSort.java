package p_Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 1/30/2021.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {10,16,2,3,5};
        System.out.println("Orginal array = " + Arrays.toString(myArray));
        selectionSort(myArray);

    }
    public static void selectionSort(int[] myArray ){
        int temp ,min_Index;
        for (int i=0 ; i<myArray.length-1 ; i++){
            min_Index = i;
            for (int j=i+1 ; j<myArray.length ; j++){
                if (myArray[j] < myArray[min_Index]){
                    min_Index = j;
                }
            }
            if (min_Index != i){
                temp = myArray[i];
                myArray[i] = myArray[min_Index];
                myArray[min_Index] = temp;
            }
        }
        System.out.println("After using ascending selection sort = " + Arrays.toString(myArray));
    }
}
//test ascending ...
class Test2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inder array length = ");
        int length = sc.nextInt(),temp , index_min ;
        int[] myArray = new int[length];
        System.out.printf("Enter %d array number = ", myArray.length);
        for (int i=0 ; i<myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }

        System.out.println("Orginal array = " + Arrays.toString(myArray));
        for (int i=0 ; i<(myArray.length-1) ; i++){
            index_min = i;
            for (int j= i+1 ; j<myArray.length ; j++){
                if (myArray[j] < myArray[index_min]){
                    index_min = j;
                }
            }
            if (index_min != i){
                temp = myArray[i];
                myArray[i] = myArray[index_min];
                myArray[index_min] = temp;
                }
            }
        System.out.println("after Using  Selection sort =  " + Arrays.toString(myArray));
        }

}
//test descending..
class Test3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inder array length = ");
        int length = sc.nextInt(),temp , index_max ;
        int[] myArray = new int[length];
        System.out.printf("Enter %d array number = ", myArray.length);
        for (int i=0 ; i<myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }

        System.out.println("Orginal array = " + Arrays.toString(myArray));

        for (int i=0 ; i< myArray.length-1 ; i++){
            index_max = i;
            for (int j=i+1 ; j<myArray.length ; j++){
                if (myArray[j] > myArray[index_max]){
                    index_max = j;
                }
            }
            if (index_max != i){
                temp = myArray[i];
                myArray[i] = myArray[index_max];
                myArray[index_max] = temp;
            }
        }
        System.out.println("Ater using selection sort = " + Arrays.toString(myArray));
    }
}


