package exercises;

import java.util.Arrays;

public class Exercise26 {
    public static void main(String[] args) {
        int[] myArray = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int count = 0 ;
        for (int i=0 ; i<myArray.length ; i++){
            if (myArray[i] !=0 ){
                myArray[count] = myArray[i];
                count++;
            }
        }
        while(count < myArray.length){
            myArray[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
