package exercises;

import java.util.ArrayList;

public class Exercise36 {
    public static void main(String[] args) {
        int[] myArray = {1, -2, 0, 5, -1, -4};
        int target_value = 2;
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i=0 ; i<myArray.length ; i++){
            for (int j=i+1 ;j<myArray.length ; j++){
                if (myArray[i]+myArray[j] !=target_value){
                    for (int k=j+1 ; k<myArray.length ; k++){
                        if ((myArray[i] + myArray[j]+myArray[k]) == target_value){

                        }
                    }
                }
            }
        }
    }
}
