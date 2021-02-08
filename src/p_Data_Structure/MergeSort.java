package p_Data_Structure;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] myArray = {6,5,4,3,2,1};
        int mid,left_mid, right_mid;
        for (int i=0 ; i<myArray.length ; i++){
            mid = (myArray.length-1)/2;
            for (int j=0 ; j<=mid ; j++){
                left_mid = mid/2;
                if (myArray[j] > myArray[left_mid]){
                    myArray[j+1] = myArray[j];

                }
                myArray[j] = myArray[left_mid];
            }

        }
        System.out.println(Arrays.toString(myArray));
    }
}
