package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,3,2,7,8};
        System.out.println("Orginal Array = " + Arrays.toString(myArray));
        for (int i=0 ; i<myArray.length ; i++){
            for (int j=i+1; j<myArray.length ; j++){
                if (myArray[i] == myArray[j]){
                    for (int k = j ; k<myArray.length-1 ; k++){
                        myArray[k] = myArray[k+1];
                    }
                }
            }
        }
        System.out.println("after remove duplicate value = " + Arrays.toString(myArray));
    }
}

