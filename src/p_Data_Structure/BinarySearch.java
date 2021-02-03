package p_Data_Structure;

import java.util.Arrays;

/**
 * Created by USER on 1/29/2021.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = {2,4,6,7,10,19,22,23,30,35,39,46,49,50};
        boolean result = contains(myArray,35);
        System.out.println(result);

    }
    public static boolean contains(int[] myArray ,int value){
        int left=0 ,right=myArray.length-1 , mid;
        while (left<=right){
            mid = (left + right) / 2;
            if (myArray[mid] == value){
                return true;
            }
            if (myArray[mid] < value){
                left = mid+1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}

class BinarySearch2{
    public static void main(String[] args) {
        int[] myArray = {30,28,26,24,22,20,15,10,5};
        Arrays.sort(myArray);
        boolean result = contains(myArray,30);
        System.out.println(result);

    }
    public static boolean contains(int[] myArray , int value ){
        int left=0 , right=myArray.length-1 , mid;
        while (left <= right){
            mid = (left + right) /2 ;
            if (myArray[mid] == value){
                return true;
            }
            if (myArray[mid] < value){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}
