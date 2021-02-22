package exercises;

import java.util.Arrays;

public class Exercise33 {
    public static void main(String[] args) {
        int[] myArray = {1,1,2,3,2,4,5,3};
        int temp = 0;
        for (int i=0 ; i<myArray.length ; i++){
            for (int j=i+1 ; j<myArray.length-1 ; j++){
                if(myArray[i] == myArray[j]){
                    for (int k=j ; k<myArray.length-1 ; k++){
                        myArray[k] = myArray[k+1];
                    }
                    myArray[myArray.length-1]=0;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        for(int i=0 ; i<myArray.length ; i++){
            if (myArray[i] !=0){
                temp++;
            }
        }
        System.out.println(temp);
    }
}
