package exercises;

/**
 * Created by USER on 1/30/2021.
 */
//Write a Java program to find the duplicate values of an array of string values.
public class Exercise12 {
    public static void main(String[] args) {
        int[] myArray = {5,2,7,8,5,2};
        for (int i=0 ; i<myArray.length ; i++){
            for (int j= i+1 ; j<myArray.length ; j++){
                if (myArray[i] == myArray[j]){
                    System.out.println(myArray[i] + " ");
                }
            }
        }
    }
}
