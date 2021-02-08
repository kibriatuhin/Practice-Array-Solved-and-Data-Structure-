package p_Data_Structure;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] myArray){
        int temp,j;
        for (int i=1 ; i<myArray.length ; i++){
            temp = myArray[i];
            j=i-1;
            while (j>=0 && myArray[j]>temp){
                myArray[j+1] = myArray[j];
                j--;
            }
            myArray[j+1] = temp;
        }
        //System.out.println();
        System.out.println("After using insertion sort = " + Arrays.toString(myArray));
    }
    public static void main(String[] args) {
        int[] myArray = {43,31,26,29,12};
        System.out.println("Orginal Array = " + Arrays.toString(myArray));
        InsertionSort.insertionSort(myArray);
    }
}


