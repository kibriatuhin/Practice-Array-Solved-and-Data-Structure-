package exercises;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by USER on 1/28/2021.
 */


//test
public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        //user input
        System.out.printf("Enter five array list no = ");
        for (int i=0 ; i< myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }
        //remove index value
        System.out.printf("Enter remove index no = ");
        int removeIndex = sc.nextInt();
        System.out.println("Orginal Array = " + Arrays.toString(myArray));
        //output
        for (int i= removeIndex ; i< myArray.length -1 ; i++){
            myArray[i] = myArray[i+1];

        }

        System.out.println("After removing the second element: "+Arrays.toString(myArray));
    }
}
