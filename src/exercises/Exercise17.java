package exercises;

import java.util.Arrays;

public class Exercise17 {
    public static void main(String[] args) {
        int[] myArray = {5,32,22,7,8,12,20,25};
        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray[myArray.length-2]);
    }
}
