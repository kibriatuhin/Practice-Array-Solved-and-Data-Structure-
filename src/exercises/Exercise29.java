package exercises;

import java.util.Arrays;

public class Exercise29 {
    public static void main(String[] args) {
        int[] myArray = {5, 7, 2, 4, 9};
        float sum=0,count=0;

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
        System.out.println("large , small= " + max + " " + min);
        for (int j=0 ; j<myArray.length ; j++){
            if (max!=myArray[j] && min!=myArray[j]){
                sum=sum+myArray[j];
                count++;
            }
        }
        System.out.println(sum + " " + count);
        float avg = sum/count;
        System.out.printf("Avarage =  %.2f\n" ,avg);
    }
}
