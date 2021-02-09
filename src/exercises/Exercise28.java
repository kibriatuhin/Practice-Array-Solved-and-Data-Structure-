package exercises;

import java.util.Arrays;

public class Exercise28 {
    public static void main(String[] args) {
        int[] myArray = {5,3,8,10,6,2};
        System.out.println("Array = " + Arrays.toString(myArray));
        int max = myArray[0],min = myArray[0];
        for (int i=0 ; i<myArray.length ; i++){
            if (max<myArray[i]){
                max = myArray[i];
            }
            if (min>myArray[i]){
                min = myArray[i];
            }

        }
        System.out.println("Difference between the largest and smallest values = " + (max-min));

    }
}
