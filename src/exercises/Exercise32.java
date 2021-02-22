package exercises;

import java.util.Arrays;

public class Exercise32 {
    public static void main(String[] args) {
        int[] myArray = {76, 77, 65, 65, 65, 77};
        int count=0;
        for(int i=0 ; i< myArray.length ; i++){
            if (myArray[i] == 77 || myArray[i] == 65){
                count++;
            }
        }
        if(count == myArray.length)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
class Test{
    public static void main(String[] args) {
        int[] myArray = { 77, 66, 65, 65, 77};
        System.out.println(contains(myArray));
    }
    public static boolean contains(int[] myArray){
        int count=0;
        for (int i=0 ; i<myArray.length ; i++){
            if (myArray[i] == 77 || myArray[i] == 65){
                count++;
            }
        }
        if(count == myArray.length)
            return true;
        else
            return false;
    }
}
