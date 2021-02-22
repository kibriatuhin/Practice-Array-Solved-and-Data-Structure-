package exercises;

import java.util.Arrays;

public class Exercise30 {

    public static void main(String[] args) {
        int[] myArray = {0,2,3,4,5,6};
        int count =0 ;
        for(int i=0 ; i<myArray.length ; i++){
            if(myArray[i] !=0 && myArray[i] !=-1){
                count++;
            }
        }
        if(count == myArray.length){
            System.out.println("true");

        }else
            System.out.println("false");
    }
}
