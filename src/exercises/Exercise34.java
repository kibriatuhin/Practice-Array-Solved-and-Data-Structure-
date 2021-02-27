package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise34 {
    public static void main(String[] args) {
        int[] myArray = {10,5,2,1,3,4,9};
        System.out.println("Orginal Array = " + Arrays.toString(myArray));
        ArrayList<Integer> subArray = new ArrayList<>();
        Exercise34.sort(myArray);

        for (int i=0 ; i<myArray.length ; i++){
            if(myArray[i] == (i+myArray[0])){
                subArray.add(myArray[i]);
            }
        }
        System.out.println(subArray + "\n New array size = " + subArray.size());

    }

    public static String sort(int[] myArray){
        int temp = 0;
        for (int i=0 ; i<myArray.length ; i++){
            for (int j=0 ; j<myArray.length-1-i ; j++){
                if (myArray[j] > myArray[j+1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        return Arrays.toString(myArray);
    }
}
class Test2{
    public static void main(String[] args) {
        int[] myArray = {3,4,5,6,10,15};
        int temp = myArray[0];
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i=0 ; i<myArray.length ;  i++){
            if (myArray[i] == (i+temp)){
                System.out.print(newArray.add(myArray[i]));
            }
        }
        System.out.println(myArray);
    }
}
class  Test3{
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,10,30};
        int[] myArray1 = {5,6,7,8,9,20};
        List<Integer> subArray = new ArrayList<>();
        for (int i=0 ; i<myArray1.length ; i++){
            if (myArray1[i] == (i+5)){
                subArray.add(myArray[i]);
            }
        }
        System.out.println(subArray.size());
    }
}

