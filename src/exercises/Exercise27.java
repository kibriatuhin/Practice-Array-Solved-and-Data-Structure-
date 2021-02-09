package exercises;

import java.util.Arrays;

public class Exercise27 {
    public static void main(String[] args) {
        int[] myArray = {1,3,4,6,5,9};
        System.out.println("Array = " + Arrays.toString(myArray));
        int even=0, odd=0;
        for (int i=0 ; i<myArray.length ; i++){
            if (myArray[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Number of Even numbers = " + even);
        System.out.println("Number of odd numbers = " + odd);
    }
}
